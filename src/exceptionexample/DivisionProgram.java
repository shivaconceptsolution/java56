package exceptionexample;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionProgram {

	int a,b,c;

	Scanner sc = new Scanner(System.in);
	void divide()
	{
		try
		{
			System.out.println("Enter First Number");
			int a = sc.nextInt();
			System.out.println("Enter Second Number");
			int b = sc.nextInt();
		    c=a/b;
		    System.out.println(c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage().toString());
		}
		catch(InputMismatchException ex)
		{
			//System.out.println(ex.getMessage().toString());
			System.out.println("Invalid data");
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
	
	void enterNumber()
	{
		try
		{
		System.out.println("Enter  Number");
		int a = sc.nextInt();
		if(a<0)
		{
			throw new ArithmeticException();
		}
		System.out.println(a);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Enter only positive number");
		}
	}
	public static void main(String[] args) {
		
	    DivisionProgram obj = new DivisionProgram();
	    obj.enterNumber();
	//    obj.divide();
		
		

	}

}
