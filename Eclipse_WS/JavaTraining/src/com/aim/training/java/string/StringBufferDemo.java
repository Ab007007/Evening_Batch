package com.aim.training.java.string;

public class StringBufferDemo {

	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("ABC");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("123");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println("Length " + sb.length());
		System.out.println("Capacity " + sb.capacity());
		
		System.out.println("Reverse " + sb.reverse());
		sb.insert(sb.length(), " My, new content");
		System.out.println(sb);
		sb.delete(0, 5);
		
		System.out.println("Char at index " + sb.charAt(0));
		
		System.out.println("Index of char " + sb.indexOf("e"));
		
		System.out.println("Last index of char " + sb.lastIndexOf("e"));
		
		System.out.println("equals " + sb.equals("Aru03.info@gmail.com"));
		
		System.out.println("Substring " + sb.substring(0, 10));
		
	}
}
