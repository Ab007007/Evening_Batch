package com.aim.training.java.arrays;

import java.util.HashSet;
import java.util.Set;

public class NoDuplicate {

	
	public static void main(String[] args) {
		
		int a[] = {1,1,2,3,4,4,5,6};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		Object[] newa = set.toArray();
		
		for (int i = 0; i < newa.length; i++) {
			System.out.println(newa[i]);
		}
		
		
	}
}
