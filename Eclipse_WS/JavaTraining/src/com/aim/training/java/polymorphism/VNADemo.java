package com.aim.training.java.polymorphism;

public class VNADemo {

	/*
	 * public void sum() {
	 * 
	 * } public void sum(int a) {
	 * 
	 * } public void sum(int a, int b) {
	 * 
	 * }
	 * 
	 * public void sum(int a, int b, int c) {
	 * 
	 * }
	 * 
	 * public void sum(int a, int b, int c, int d) {
	 * 
	 * }
	 * 
	 * public void sum(int a, int b, int c, int d, int e) {
	 * 
	 * }
	 */
	
	
	public static void sum(int... a) {
		
		System.out.println(a.length);
	}
	
	
	
	public static void main(String[] args) {
		
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
		sum(10,20,30,40,50);
		sum(10,20,30,40,50,60);
			
	}
}
