package com.aim.training.java.collections.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListGenericsDemo {

	public static void printListUsingFor(List<Integer> l) {
		// for loop
		System.out.println("--- Priniting using basic for loop ---");
		for (int i = 0; i < l.size(); i++) {
			System.out.println("Element at index " + i + " is " + l.get(i));
		}
	}

	public static void printListUsingForEach(List<Integer> l) {
		// for each
		System.out.println("--- Printing using for each loop ---");
		for (Object ele : l) {
			System.out.println(ele);

		}
	}

	public static void printUsingIterator(List<Integer> l) {
		// Iterator
		System.out.println("--- Printing using Iterator ---");
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();

		l.add(5);
		l.add(50);
		l.add(5);
		l.add(250);
		l.add(50);
		l.add(5);
		l.add(250);
		l.add(50);
		l.add(5);
		l.add(250);
		l.add(50);
		l.add(5);
		l.add(250);

		printListUsingFor(l);

		System.out.println("Inserting element at 0 index");

		printListUsingFor(l);

		System.out.println("Removing element at 4th index");
		l.remove(4);
		printListUsingFor(l);

		System.out.println("Replace functionality");

		printListUsingFor(l);

	}

}
