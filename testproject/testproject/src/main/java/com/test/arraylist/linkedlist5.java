package com.test.arraylist;

import java.util.LinkedList;
import java.util.List;

public class linkedlist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> words = new LinkedList<>();
		
		List<String> text = new LinkedList<>();
		
		words.add("피자");   //index 0
		words.add("치킨");	//index 1
		words.add("초밥");	//index 2
		words.add("초록매실"); //index 3
		words.add("족발"); //index 4
		
		//인덱스를 이용한 값 삭제
		words.remove(1);
		
		//값을 검색하여 값 삭제
		words.remove("피자");
		
		//맨 앞의 값을 삭제
		words.removeFirst();
		
		//맨 뒤의 값을 삭제
		words.removeLast();
		
		System.out.println(words);
		
		
	/*	
		get(index);
		String food = words.get(2);
	*/	
		
		
	}

}
