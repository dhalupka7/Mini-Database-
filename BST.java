package h10311;

import java.util.*;
public class BST <T extends Comparable>{
    
    public BinaryTreeNode root;
    
    public void BST()
    {
        root = null;
    }
    
    public BinaryTreeNode getRoot()
    {
        return root;
    }
    
    public boolean isEmpty()
    {
       return root == null;
    }
    
   
    
    public void inOrder(BinaryTreeNode <Person> t)
    {
        if(t!=null)
        {
            inOrder(t.getLeft());
            System.out.println(t.getElement());
            inOrder(t.getRight());
        }
    }
     public static  <T extends Comparable> void TreeInsert(BinaryTreeNode <Person> curr, Person num)         //tree inserts for string
        {     BinaryTreeNode b=new BinaryTreeNode(num);
              
                while (curr != null) {
               Person currValue = curr.getElement();
               
               if(num.lName.compareTo(currValue.lName)<0){
                    if (curr.getLeft() == null) {
                        curr.setLeft(b);
                        
                        break;
                    } else {
                        curr = curr.getLeft();
                        
                    }

                } else {
                    if (curr.getRight() == null) {
                        curr.setRight(b);
                       
                        break;
                    } else {
                        curr = curr.getRight();
                       
                    }
                }
            }      
        }
    
    
    
    public static BinaryTreeNode insert(BinaryTreeNode<Person> node, Person data)   //tree insert for strings
    {
        if(node == null)
        {
            node = new BinaryTreeNode(data);
        }
        
        else
        {
         Person data2 = (Person)node.getElement();
         if(data.lName.compareTo(data2.lName)<0)
         {
             node.left = insert(node.left,data);
         }
        
        else
        {
             node.right = insert(node.right,data);
        }
        }
     return node;   
    }
  }

