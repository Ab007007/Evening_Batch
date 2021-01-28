package com.aim.training.java.accessmodifier;

public class StaticDemo {

	int a =10;
	static int b = 20;
	
	public static void main(String[] args) {
		
		StaticDemo sd1 = new StaticDemo();
		StaticDemo sd2 = new StaticDemo();
		StaticDemo sd3 = new StaticDemo();
		StaticDemo sd4 = new StaticDemo();
		
		
		sd1.a = 200;
		sd2.a = 201;
		sd3.a = 202;
		sd4.a = 203;
		
		System.out.println(sd1.a);
		System.out.println(sd2.a);
		System.out.println(sd3.a);
		System.out.println(sd4.a);
		System.out.println(b);
		System.out.println(sd1.b);
		System.out.println(sd2.b);
		System.out.println(sd3.b);
		System.out.println(sd4.b);
	}
	
	
	
}
