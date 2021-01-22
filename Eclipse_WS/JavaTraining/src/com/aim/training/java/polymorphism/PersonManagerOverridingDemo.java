package com.aim.training.java.polymorphism;

class Person {
	String name;
	int age;
	static final String country ="India";
	
	
	
	public String toString() {
		String str  = "Person class - Object has \nName - " + this.name + "\nAge - " + this.age +
				"\nCountry - " + country + "\n-----------------------------------------------";
		
		return str;
	}
	
}

public class PersonManagerOverridingDemo {

	public static void main(String[] args)
	{
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
