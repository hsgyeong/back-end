package com.test.arraylist;

import java.util.LinkedList;

public class linkedlist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> words = new LinkedList<>();
		
		words.add("피자");
		words.add("치킨");
		words.add("초밥");
		
		//set(index, 값);
		words.set(1, "햄버거");
		
		//피자 -> 햄버거 -> 초밥
		System.out.println(words);
		
	}

}
