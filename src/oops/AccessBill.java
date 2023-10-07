package oops;

public class AccessBill {

	public static void main(String[] args) {
		//Billing obj = new Billingnew();
		Billing obj = new Billing();
		obj.accept("product1",4000,4);
		obj.bill();
		obj.display();
		

	}

}
