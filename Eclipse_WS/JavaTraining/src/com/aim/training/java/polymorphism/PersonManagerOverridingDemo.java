package com.aim.training.java.polymorphism;

class Person {
	static int count = 0;
	
	{
		count++;
	}
	
	String name;
	int age;
	static final String country ="India";
	
	public Person() {
	
		System.out.println("total " + count + " Objects in Person class");
	}
	
	public String toString() {
		String str  = "Person class - Object has \nName - " + this.name + "\nAge - " + this.age +
				"\nCountry - " + country + "\n-----------------------------------------------";
		
		return str;
	}
	
}

public class PersonManagerOverridingDemo {
	
	static
	{
		System.out.println("--- i'm before main ---");
	}

	
	public static void main(String[] args)
	{
		System.out.println("-- Main started --");
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "Aravind";
		p1.age = 35;
	
		p2.name = "Raghu Veer";
		p2.age = 21;
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
	}
}
