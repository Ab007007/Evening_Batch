package com.aim.training.java.interfaces;

public interface HumanBeing {

	// public static final int MAX_AGE = 120;
	int MAX_AGE = 120;
	String[] PLACES = {"Vijayanagar", "Rajainagar"};
	// public abstract void  language();
	String languagesKnown(String[] languages);
	String nativeFrom();
}
