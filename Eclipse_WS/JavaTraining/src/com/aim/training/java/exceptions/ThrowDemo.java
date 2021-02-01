package com.aim.training.java.exceptions;

import java.util.Scanner;

public class ThrowDemo 
{
	static int balance = 10000;
	static Scanner sc =  null;
	public static void main(String[] args) 
	{
		String choice = "no";
		int tempBalance ;
		System.out.println("--main Started---");
		do {
			sc = new Scanner(System.in);
			System.out.println("Enter the amount you want to withdraw");
			int amount  = sc.nextInt();
			
			tempBalance = balance - amount;
			if(tempBalance<=0)
			{
				try {
					throw new Exception();
				}
				catch(Exception ex)
				{
					System.out.println("your balance is low you have " + balance);
				}
				finally
				{
					System.out.println("i'm the common code");
				}
			}
			else {
				balance = tempBalance;
				System.out.println("you withdraw " + amount + " from your account ");
				System.out.println("Your current balance is " + balance);
				
			}
			
			System.out.println("Do you want to continue ???");
			choice = sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		
		
		System.out.println("--main Ended---");
	}
	
	
	

}
