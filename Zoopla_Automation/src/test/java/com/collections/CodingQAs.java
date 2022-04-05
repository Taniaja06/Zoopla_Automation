package com.collections;

import java.util.HashSet;
import java.util.Set;

public class CodingQAs {

	
	public static void getDupValues() {
		int [] cal = {10, 20, 44, 20};
		//set interface
		Set<Integer> number = new HashSet<>();
		for(int calcu:cal) {
			if (number.add(calcu)==false) {
		
				System.out.print(calcu);
			}
		}
		
		
	}
	public static void getstringDup() {
		String [] nickName = {"tani","sara", "tani","others"};
		Set<String> tag = new HashSet<>();
		for(String types : nickName) {
			if(tag.add(types)==true) {
				System.out.println(types);
		}
		
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		CodingQAs.getDupValues();
		CodingQAs.getstringDup();
	}
	
}


