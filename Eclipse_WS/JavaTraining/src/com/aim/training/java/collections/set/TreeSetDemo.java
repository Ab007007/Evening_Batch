package com.aim.training.java.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set set = new TreeSet();
		
		set.add("ABC");
		set.add("XYZ");
		set.add("PQR");
		
		printSetElements(set);
		
		set.add("LMN");
		printSetElements(set);
	}

	private static void printSetElements(Set set) {
		System.out.println("--- Printing Set items with size ----" + set.size());
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
