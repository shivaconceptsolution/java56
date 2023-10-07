package oops;

public class BankInfo {

	static String bankname;
	String accno;
	String custname;
	
	static void bankInfo()
	{
		bankname="SBI";
		System.out.println("Bank "+bankname);
	}
	void accept(String accno,String custname)
	{
		this.accno=accno;
		this.custname=custname;
	}
 
	void display()
	{
		System.out.println("Customer Accno is "+accno);
		System.out.println("Customer Name is "+custname);
	}
	public static void main(String[] args) {
		BankInfo.bankInfo();
		BankInfo obj = new BankInfo();
		obj.accept("12345","CUST1");
		obj.display();

	}

}
