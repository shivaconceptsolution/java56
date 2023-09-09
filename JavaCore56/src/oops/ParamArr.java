package oops;

public class ParamArr {
   void displayArr(int arr[])
   {
	   for(int data:arr)
	   {
		   System.out.println(data);
	   }
   }
   int [] displayArr1()
   {
	   int x [] = {1,7,9,11};
	   return x;
   }
   
   public static void main(String args[])
   {
	   int x[] = {12,34,67,78};
	   ParamArr obj = new ParamArr();
	   obj.displayArr(x);
	   System.out.println("Array Elements are");
	   int y[] = obj.displayArr1();
	   for(int k:y)
	   {
		   System.out.println(k);
	   }
	   
   }
}
