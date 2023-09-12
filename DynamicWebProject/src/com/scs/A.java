package com.scs;

public class A {
	public class B
	{
		void fun1()
		{
			System.out.println("B");
		}
		
	}
	public static class C
	{
		static void fun1()
		{
			System.out.println("C");
		}
		
	}
	void fun()
	{
		System.out.println("A");
	}

}
