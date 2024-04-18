package com.test.vector;

import java.util.Vector;

public class vector4 {

	public static void main(String[] args) {
		
		Vector<String> words = new Vector<String>();
		
		words.add("피자");
		words.add("치킨");
		words.add("초밥");
		words.add("햄버거");
		
		//vector 요소 개수
		int size = words.size();
		
		System.out.println(size); //4
		
		//vector 용량
		int capacity = words.capacity();
		
		System.out.println(capacity); //10
		
		//vector 요소 구하기
		String food = words.get(3);
		
		System.out.println(food); //햄버거
		
		int boo = words.indexOf("카페라떼");
		
		System.out.println(boo);
		
	}

}
