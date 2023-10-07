package exceptionexample;

public class HandleException {
public static void main(String args[])
{
	try
	{
		int num=-5;
		if(num<0)
		{
			throw new NegativeNumberException();
		}
		System.out.println(num);
	}
	catch(NegativeNumberException ex)
	{
		System.out.print(ex);
	}
}
}
