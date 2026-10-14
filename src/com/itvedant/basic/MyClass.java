package com.itvedant.basic;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My first class in java");
		Second sec=new Second();
		sec.A();
		sec.B();
	
	}	

}
class Second{
	void A() {
		System.out.println("Second classs");
	}
	void B() {
		System.out.println("second method");
	}
}
