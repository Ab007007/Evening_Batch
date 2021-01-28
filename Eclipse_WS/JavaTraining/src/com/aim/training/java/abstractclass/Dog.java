package com.aim.training.java.abstractclass;

public class Dog extends Animal
{

	@Override
	void getColor() {
		System.out.println("Dog is white with black designs");
	}
	
	@Override
	void maxLife() {
		System.out.println("it can live upto 12 years");
		 
	}
	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		d1.getEyes();
		d1.getEars();
		d1.getColor();
		d1.maxLife();
	}
}
