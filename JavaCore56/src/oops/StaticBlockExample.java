package oops;

public class StaticBlockExample {
   static int x1,y1;
   static
   {
	   x1=100;
	   y1=200;
	   System.out.println(x1+y1);
   }
   public static void main(String args[])
   {
	   x1=10;
	   y1=20;
	   System.out.println(x1+y1);
   }
   static
   {
	   x1=1;
	   y1=2;
	   System.out.println(x1+y1);
   }
}
