package com.test.vector;

import java.util.Arrays;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
	
		//타입 설정
		Vector<Integer> v = new Vector<>();
		
		//초기 용량(capacity) 설정 (10)
		Vector<String> v2 = new Vector<>(10);
		
		//초기값 지정
		Vector<Integer> v3 = new Vector<>(Arrays.asList(1,2,3));

	}

}
