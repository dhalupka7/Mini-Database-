package h10311;


public class Person <T extends Comparable> {                                    //Person class

    public String fName;
    public String lName;
    public String dob;
    public String pNumber;
    
   public <T> Person()                                                          //constructors
   {
       fName ="";
       lName ="";
       dob ="";
       pNumber = "";
       
       
   }
   
   public <T> Person(String f,String l, String d , String p)
   {
       fName = f;
       lName = l;
       dob = d;
       pNumber = p;
       
   }

  
    public String getfName() {                                                  //gets/sets
        return fName;
    }

    public void setfName(String name) {
        this.fName = name;
    }
    
    public String getLname(){
        return lName;
    }
    
     public void setLname(String L){
        this.lName = L;
    }
      public String getDob(){
        return dob;
    }
       public void setDob(String D){
        this.dob = D;
    }
        public String getPnumber(){
        return pNumber;
    }
         public void setPnumber(String P){
        this.pNumber=P;
    }
    
    public void writeOutput()                                                   //outputs
    {
        System.out.println("Name: "+ fName+ " "+lName);
        System.out.println("Birthday: " + dob);
        System.out.println("Phone Number: "+ pNumber);
    }
    
    public  <T extends Comparable> Boolean compareTo(Person y)                  //compare to 
    {
        if(this.lName.compareTo(y.lName) > 0) return true;
        else return false;
    }
   
   
    
}