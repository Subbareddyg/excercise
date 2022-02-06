package com.practice.example.uniquechar;

import java.util.HashMap;

public class UniqueChartersofStringHashMap {
	
	
	public static void main(String args[]) {
		String str="Rama";
		char[] charstr=str.toCharArray();
		HashMap<Character,Character> map=new HashMap<Character,Character>();
		for(int i=0;i<charstr.length;i++) {
			map.put(charstr[i], charstr[i]);
		}
		int count=0;
		count=map.entrySet().size();
		if(count==str.length()) {
				System.out.println("unique characters");
				return;
		}
		System.out.println("all characters are not unique");
	}
}
	// complexity is O(n)) , can I avoid second loop


