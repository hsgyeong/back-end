package com.test.vector;

import java.util.Vector;

public class vector2 {

	public static void main(String[] args) {
		
		Vector<String> words = new Vector<String>();
		
		//값 추가
		words.add("피자");
		words.add("치킨");
		words.add("초밥");
		words.add("햄버거");
		
		//인덱스 2 위치에 초록매실 삽입 (삽입하기 위해서 기존의 요소들은 뒤로 이동한다.)
		words.add(2,"초록매실");
		
		//값 변경
		words.set(1, "족발");
		
		System.out.println(words);
		
	}

}
