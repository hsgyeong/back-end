package com.test.arraylist;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> words = new LinkedList<>();
	
		words.add("피자");
		words.add("치킨");
		words.add("초밥");
		words.add("떡볶이");
		
		//피자 -> 치킨 -> 초밥 -> 떡볶이
		
		//첫 번째 Node의 앞에 삽입
		words.addFirst("시작");
		
		//시작 -> 피자 -> 치킨 -> 초밥 -> 떡볶이
		
		//마지막 Node의 뒤에 삽입
		words.addLast("마지막");
		
		//시작 -> 피자 -> 치킨 -> 초밥 -> 떡볶이 -> 마지막
		System.out.println(words);
	}

}
