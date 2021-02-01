package com.aim.training.java.collections.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	
	public static void main(String[] args) {
		
		int[] arr = {12,12,12,23,34,12,12,23,23,34,45,56,7,78,78,4};
		
		Set set = new HashSet();
		System.out.println("Array with duplicate elements " + arr.length);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
			set.add(arr[i]);
			
		}
		
		System.out.println("--- Printing no dubplicate Array----");
		Object[] arrNoDub = set.toArray();
		System.out.println("Array without duplicate elements " + arrNoDub.length);
		 for (int i = 0; i < arrNoDub.length; i++) {
			 System.out.println(arrNoDub[i]);
		}
	}
}
