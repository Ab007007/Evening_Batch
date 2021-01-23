package com.aim.training.java.loops;

public class ForEachLoopDemo {
	
	public static void main(String[] args) {
		int marks[] = { 85, 45, 60, 55, 77, 80 };
		//String names[] = {"Raghu", "Santhosh", "Tejashree" , "pavani" , "Bhavya", "Siddu"};
		int temp = 0;
		
		for (int i : marks) {
			System.out.println(i);
			temp = temp + i;
		}
		System.out.println("Total marks obtained - " + temp);
		System.out.println(" Percentage Marks Obtained - " + (temp / marks.length));

		
	}
	

}
