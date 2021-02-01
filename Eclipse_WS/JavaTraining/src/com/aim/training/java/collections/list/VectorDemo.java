package com.aim.training.java.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void printListUsingFor(List l) {
		// for loop
		System.out.println("--- Priniting using basic for loop ---");
		for (int i = 0; i < l.size(); i++) {
			System.out.println("Element at index " + i + " is " + l.get(i));
		}
	}

	public static void printListUsingForEach(List l) {
		// for each
		System.out.println("--- Printing using for each loop ---");
		for (Object ele : l) {
			System.out.println(ele);

		}
	}

	public static void printUsingIterator(List l) {
		// Iterator
		System.out.println("--- Printing using Iterator ---");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {

		List l = new Vector();

		l.add(5);
		l.add(55.55);
		l.add(true);
		l.add("MyName");
		l.add('C');
		
		printListUsingFor(l);
		
		System.out.println("Inserting element at 0 index");
		l.add(0, "new element");
		
		printListUsingFor(l);
		
		System.out.println("Removing element at 4th index");
		l.remove(4);
		printListUsingFor(l);
		
		System.out.println("Replace functionality");
		l.add(4, "NewC");
		l.remove(5);
		printListUsingFor(l);

	}

}
