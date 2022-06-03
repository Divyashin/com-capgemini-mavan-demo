package com.cg.mavan.demo;

import java.util.ArrayList;

public class ColDemo {
	public static void main(String[] args) {

//		int[] arr = {10, 20, 30.5, "abc", false};

		ArrayList myList = new ArrayList();

		System.out.println(myList.size());
		System.out.println(myList);
		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		myList.add(false);
		System.out.println(myList.size());
		System.out.println(myList);
		myList.remove(2);
		System.out.println(myList.size());
		System.out.println(myList);
		
//		List myList2 = new ArrayList();
//		myList2 = new LinkedList();
//		myList = new LinkedList();


	}

}
