package com.test.arraylist;

import java.util.LinkedList;

public class linkedlist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> words = new LinkedList<>();
		
		words.add("피자");
		words.add("치킨");
		words.add("초밥");
		
		//add(index, 값);
		words.add(1, "초록매실");
		
		//피자 -> 초록매실 -> 치킨 -> 초밥
		System.out.println(words);
	}

}
