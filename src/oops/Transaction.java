package oops;
import java.util.Scanner;
public class Transaction extends Bank {

	private int mypin;
	Scanner sc = new Scanner(System.in);
	public Transaction() {
		mypin=9823;
	}
	int accept()
	{
		System.out.println("Enter pincode");
		return sc.nextInt();
	}
	@Override
	void credit(int amount) {
		if(login(accept()))
		{
		balance+=amount;
		}
		else
		{
			System.out.println("Invalid Pincode");
		}
		
	}

	@Override
	void debit(int amount) {
		if(login(accept()))
		{
		balance-=amount;
		}
		else
		{
			System.out.println("Invalid Pincode");
		}
		
	}

	@Override
	void checkBalance() {
		if(login(accept()))
		{
			System.out.println("final amount is "+balance);
		}
		else
		{
			System.out.println("Invalid Pincode");
		}
		
		
	}
	@Override
	boolean login(int pincode)
	{
		if(pincode==mypin)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
