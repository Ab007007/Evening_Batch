package com.aim.training.java.thread;

public class PrinterDemo implements Runnable {

	public void run() {
		System.out.println();
		test();
		test2();
	}
	
	
	public synchronized void test() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---Printing HI ----" + Thread.currentThread().getName());

	}
	public void test2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--- Exiting from thread run-method ----");

	}
}
