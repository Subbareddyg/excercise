package com.practice.example.uniquechar;

import java.util.Arrays;

public class NoAddtionalDataStructure {
	
	public static void main(String args[]) {
		String str="qwertyasdfgzxcv";
		char[] charstr=str.toCharArray();
		Arrays.sort(charstr);
		for(int i=0;i<charstr.length-1;i++) {
			if(charstr[i]==charstr[i+1]) {
				System.out.println("its not unique");
				return;
			}
		}
		System.out.println("All characters are unique");
	}
	
}
