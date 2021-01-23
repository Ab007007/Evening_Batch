package com.aim.training.java.loops;

public class ForDemo {
	
	public static void main(String[] args) {
		
		int marks[] = {85 , 45, 60 , 55 , 77, 80};
		
		int temp = 0;
		for (int i = 0; i < marks.length; i++) {
			System.out.println("subject " + (i+1) + " has " + marks[i] + " marks");
			
			temp = temp + marks[i];
		}
		System.out.println(temp);
		System.out.println(" Percentage Marks Obtained - " + (temp/marks.length));
		
	}

}
