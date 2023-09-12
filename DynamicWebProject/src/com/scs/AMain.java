package com.scs;

public class AMain {

	public static void main(String[] args) {
		A obj = new A();
		obj.new B().fun1();;
		obj.fun();
		A.C.fun1();

	}

}
