package com.aim.training.java.thread;

public class RunnableManager {

	
	public static void main(String[] args) {
		
		PrinterDemo p = new PrinterDemo();
		Thread t1 =  new Thread(p);
		Thread t2 =  new Thread(p);
		
		t1.setName("first thread");
		t2.setName("second thread");
		t1.start();
		t2.start();
		
		System.out.println("Main exit");
		
	}
}
