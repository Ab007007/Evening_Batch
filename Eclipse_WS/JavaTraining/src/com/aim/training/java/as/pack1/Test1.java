package com.aim.training.java.as.pack1;

public class Test1 {

	private int a = 10;     // Accessible only inside Class
	int b = 20;				// Accessible only inside Package by all Classes
	protected int c = 30;	// Accessible only inside Package by all Classes also outside the 
								//package only if class is inherited class
	public int d = 40;		// Accessible inside the project
	
	
	
	/*
	 * private void test() {
	 * System.out.println("--- priniting values using funciton ----");
	 * System.out.println(a); System.out.println(b); System.out.println(c);
	 * System.out.println(d);
	 * 
	 * } 
	 * 
	 *  void test() {
	 * System.out.println("--- priniting values using funciton ----");
	 * System.out.println(a); System.out.println(b); System.out.println(c);
	 * System.out.println(d);
	 * 
	 * }
	 * 
	 *  protected void test() {
	 * System.out.println("--- priniting values using funciton ----");
	 * System.out.println(a); System.out.println(b); System.out.println(c);
	 * System.out.println(d);
	 * 
	 * }
	 */
	public void test()
	{
		System.out.println("--- priniting values using funciton ----");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		
		t1.test();
	}
}
