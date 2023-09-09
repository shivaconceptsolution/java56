package oops;

public class PermanentEmployee extends Admin {

	 private int allowance;
	 void accept2(int allowance)
	{
		this.allowance=allowance;
	}
    void display2()
    {
    	System.out.println("Allowance is "+allowance);
    }
}
