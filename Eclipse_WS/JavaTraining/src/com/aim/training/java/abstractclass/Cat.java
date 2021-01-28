package com.aim.training.java.abstractclass;

public class Cat extends Animal
{

	@Override
	void getColor() {
		System.out.println("Cat is perl white ");
	}
	
	@Override
	void maxLife() {
		System.out.println("it can live upto 8 years");
		 
	}
	public static void main(String[] args) {
		Cat d1 = new Cat();
		d1.getEyes();
		d1.getEars();
		d1.getColor();
		d1.maxLife();
	}
}
