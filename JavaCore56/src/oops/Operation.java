package oops;

public class Operation {

	int a=100,b=20,c;
	void addition()
	{
		c=a+b;
		System.out.println(c);
	}
	int substraction()
	{
		c=a-b;
		return c;
	}
	void multiplication(int a, int b)
	{
		c=a*b;
		System.out.println(c);
	}
	int division(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
