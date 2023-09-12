package com.scs;

public class Employee {
	private static Employee obj;
    private Employee()
    {
    	
    }
    public static Employee getInstance()
    {
    	if(obj==null)
    	{
    		System.out.println("Object Created");
    		obj=new Employee();
    		return obj;
    	}
    	else
    	{
    		System.out.println("Object Already Created");
    		return obj;
    	}
    }
	
}
