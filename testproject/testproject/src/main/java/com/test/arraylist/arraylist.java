package com.test.arraylist;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> words = new ArrayList<>();
		
		words.add("피자");
		words.add("치킨");
		words.add("초밥");
		words.add("떡볶이");
		
		words.set(1, "햄버거");
		
		int size = words.size(); 
		
		String food = words.get(2);
	
		//인덱스를 이용한 값 삭제
		words.remove(1);
		
		//값을 검색하여 값 삭제
		words.remove("떡볶이");
		
		System.out.println(words);
		
	}

}
