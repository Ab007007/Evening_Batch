package com.aim.training.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		Set set = new LinkedHashSet();
		
		set.add(10);
		set.add(50);
		set.add(5);
		
		printSetElements(set);
		
		set.add(5);
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
