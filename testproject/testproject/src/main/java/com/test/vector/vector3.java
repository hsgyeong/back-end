package com.test.vector;

import java.util.Vector;

public class vector3 {

	public static void main(String[] args) {
		
		Vector<String> words = new Vector<String>();
		
		words.add("피자");
		words.add("치킨");
		words.add("초밥");
		words.add("햄버거");
		
		words.remove(1);  //index 1의 값 제거
		
		System.out.println(words);
		
			                        //모든 데이터 제거 
		words.removeAllElements();  //또는 words.clear();
		
		System.out.println(words);

	}

}
