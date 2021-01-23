package com.aim.training.java.loops;

public class DoWhileDemo {

	public static void main(String[] args) {
		int marks[] = { 85, 45, 60, 55, 77, 80 };
		int i = 0;
		int temp = 0;
		
		do
		{
			System.out.println("subject " + (i + 1) + " has " + marks[i] + " marks");

			temp = temp + marks[i];
			i = i +1;
		}while(i < marks.length);
		System.out.println(temp);
		System.out.println(" Percentage Marks Obtained - " + (temp / marks.length));

	}

}
