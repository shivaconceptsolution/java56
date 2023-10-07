package oops;

public class Employee extends Admin {
    private int salary;
     void accept1(int salary)
     {
    	 this.salary=salary;
    	 
     }
     
     void display1()
     {
    	 System.out.println("Salary is "+salary);
     }
     
     
}
