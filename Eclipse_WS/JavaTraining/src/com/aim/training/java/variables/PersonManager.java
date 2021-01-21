package com.aim.training.java.variables;



class Person {
	String name;
	int age;
	static final String country ="India";
	
}


public class PersonManager {

	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.name = "Aravind";
		p1.age = 35;
		//p1.country = "PAKISTAN";
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(Person.country);
		
		Person p2 = new Person();
		p2.name = "Raghu Veer";
		p2.age = 21;
		//p2.country = "India";
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.country);
		
	}
}
