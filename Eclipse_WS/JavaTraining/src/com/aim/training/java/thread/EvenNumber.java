package com.aim.training.java.thread;

public class EvenNumber extends Thread
{
	
	
	public void run() {
		System.out.println("---Printing Even numbers ----");
		for (int i = 2; i < 10; i++) 
		{
			System.out.println(Thread.currentThread().getName() + " - " + i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
