package oops;

public class Billing {
	String productname;
    int price;
    int qty;
    float bill;
    void accept(String productname,int price,int qty)
    {
         this.productname=productname;
         this.price=price;
         this.qty=qty;
    }

    void bill()
    {
       bill = this.price*qty;
    }
    void display()
    {
      System.out.println("Productname is "+productname);
      System.out.println("Total Bill is "+bill);
      

    }
}
