package com.test.arraylist;

import java.util.ArrayList;
import java.util.List;

public class arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		ArrayList<String> text = new ArrayList<>();
		
		for(int i=0; i<20; i++) {
			//null값으로 채운다.
			text.add(null);
		}
		
		int size = text.size();
		
		System.out.println(size);
	}

}
