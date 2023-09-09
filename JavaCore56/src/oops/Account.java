package oops;

public class Account {

	public static void main(String args[])
    {
         /*	 Employee obj = new Employee();
   	 obj.accept(1,"EMP1");
   	 obj.accept1(12000);
   	 obj.display();
   	 obj.display1();
   	 */
		PermanentEmployee obj = new PermanentEmployee();
		obj.accept(2, "EMP2");
		//obj.accept1(12000);
		obj.accept2(2000);
		obj.display();
		//obj.display1();
		obj.display2();
    }

}
