package oops;

public abstract class Bank {
	 int balance=5000;
     void bankInfo()
     {
    	 System.out.println("Bank Information");
     }
     abstract void credit(int amount);
     abstract void debit(int amount);
     abstract void checkBalance();
     abstract boolean login(int pincode);
     
}
