//Program to go through list of persons and display what user chooses.
package h10311;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class H10311 {

    
    public static void main(String[] args) {                                    //main
        
        
          File f = new File("H10input.txt"); // Text file
        Scanner p = null; // Scanner for both File IO and Keyboard input
        
        try {                                                                   //try/catch
            p = new Scanner(f); // Create the scanner to read the file
        } catch (FileNotFoundException e) { // Exit if bad things happen
            System.out.println("File not Found!");
            System.exit(-1);
        }
        BST myTree = new BST();
        BinaryTreeNode root = myTree.getRoot();
        while(p.hasNext())
        {
            String fn = p.next();
            String ln = p.next();
            String dob = p.next();
            String pn = p.next();
            Person per = new Person(fn,ln,dob,pn);
           root = BST.insert(root, per);
        }
      
      
        
        
        int select =0;
        do{
        Scanner scnr = new Scanner(System.in);
        System.out.println("MAIN MENU");                                        //main menu
        System.out.println("----------------");
        System.out.println(" Please select a number:");
        System.out.println("1) Enter another person");
        System.out.println("2) Show data of certain person");
        System.out.println("3) List everyone");
        System.out.println("4) Search for people with certain month");
        System.out.println("5) Quit");
        
         select = scnr.nextInt();
         
        
        switch (select) {                                                       //switch statement for menu
            case 1:
                
                addPerson(root);
                break;
            case 2:
                 System.out.println("Enter last name of person: ");
                 String l = scnr.next();
                 Person k = new Person("",l,"","");
                 
     
                showPerson(root, k);
                break;
            case 3:
                showAllData(myTree,root);
                break;
            case 4:
                  System.out.println("Enter month (00): ");
                     String m = scnr.next();
                     Person w = new Person("","",m,"");
                searchMonth(root,w);
                break;
            case 5:
                break;
            default:
                System.out.println("Please select a number from the menu!!");
                System.out.println();
                break;
        }
                 
    }while(select != 5);         
        
                }
    
    public static void addPerson(BinaryTreeNode root)                           //add person method
    {
      

        Scanner scnr = new Scanner(System.in);
     System.out.println("Enter First Name: ");
     String fn =scnr.next();
     System.out.println("Enter Last Name: ");
     String ln =scnr.next();
     System.out.println("Enter Date of Birth: ");
      String dob =scnr.next();
     System.out.println("Enter Phone Number: ");
     String pn =scnr.next();

     Person p = new Person(fn,ln,dob,pn);
     
     BST.TreeInsert(root, p);

    }
    
    public static void showPerson( BinaryTreeNode <Person> root, Person l)      //Displays person that user writes in
    {
       
         if(root != null)
        {
      showPerson(root.getLeft(), l); 
      if(root.getElement().lName.equals(l.lName))
      {
       System.out.println();
       root.getElement().writeOutput();
       System.out.println();
      }
      
      showPerson(root.getRight(),l);  
        
        } 
 
        
        
    }
    
    public static void showAllData(BST myTree, BinaryTreeNode <Person> root)     //Displays all data
    {
        if(root != null)
        {
      showAllData(myTree,root.getLeft());  
      root.getElement().writeOutput();
      System.out.println();
      showAllData(myTree,root.getRight());  
        
        } 
    }
    
    
    public static void searchMonth(BinaryTreeNode <Person> root, Person k)     //Displays all people with same month
    {
    
       
      if(root != null)
        {
      searchMonth(root.getLeft(),k);  
      if(root.getElement().dob.substring(0,2).equals(k.dob.substring(0,2)))
      {
        System.out.println();
        root.getElement().writeOutput();
        System.out.println();
      }
      searchMonth(root.getRight(),k);  
        
        } 
      
  
    }
    
}
