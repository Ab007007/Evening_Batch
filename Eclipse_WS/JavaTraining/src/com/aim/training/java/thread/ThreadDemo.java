package com.aim.training.java.thread;

public class ThreadDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		OddNumber od = new OddNumber();
		EvenNumber ev = new EvenNumber();
		
		od.start();
		ev.start();
		
		System.out.println("--- Printing 1-100 -----------");
		for (int i = 1; i < 10; i++) 
		{
			System.out.println("main " + i);
			Thread.sleep(1000);
		}
	}
}
