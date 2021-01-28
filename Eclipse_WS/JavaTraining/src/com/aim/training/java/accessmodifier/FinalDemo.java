package com.aim.training.java.accessmodifier;

public class FinalDemo {

	int a =10;
	final static int b = 20;
	
	
	static final void test() {
		System.out.println(" Its a final value ");
	}
	public static void main(String[] args) {
		
		FinalDemo sd1 = new FinalDemo();
		FinalDemo sd2 = new FinalDemo();
		FinalDemo sd3 = new FinalDemo();
		FinalDemo sd4 = new FinalDemo();
		
		
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
