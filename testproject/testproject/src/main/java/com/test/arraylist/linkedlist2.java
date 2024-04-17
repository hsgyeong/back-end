package com.test.arraylist;

import java.util.LinkedList;

public class linkedlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> words = new LinkedList<>();
		
		words.add("피자");
		words.add("치킨");
		words.add("초밥");
		words.add("떡볶이");
		
		//피자 -> 치킨 -> 초밥 -> 떡볶이
		
		int size = words.size();
		
		//크기 4
		System.out.println(size);
	}

}
