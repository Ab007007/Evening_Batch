package com.aim.training.java.thread;

public class PrinterDemo implements Runnable {

	public void run() {
		test();
		test2();
	}
	
	
	public synchronized void test() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---Printing HI ----");

	}
	public void test2() {
		System.out.println("--- Exiting from thread run-method ----");

	}
}
