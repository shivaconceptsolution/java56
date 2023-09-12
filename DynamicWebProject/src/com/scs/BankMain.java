package com.scs;

public class BankMain {

	public static void main(String[] args) {
		Bank obj = new Bank(){

			@Override
			public void info() {
				System.out.println("Bank Info");
				
			}
			
		};
		obj.info();

	}

}
