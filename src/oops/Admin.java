package oops;

public class Admin {
   private int aid;
   private String name;
   void accept(int aid,String name)
   {
	   this.aid=aid;
	   this.name=name;
   }
   void display()
   {
	   System.out.println("Id is "+aid);
	   System.out.println("Name is "+name);
   }
}
