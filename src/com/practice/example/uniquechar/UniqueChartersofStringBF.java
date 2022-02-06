package com.practice.example.uniquechar;

public class UniqueChartersofStringBF {
	
	
	public static void main(String args[]) {
		String str="arfg";
		char[] charstr=str.toCharArray();
		for(int i=0;i<charstr.length;i++) {
			for(int j=0;j<charstr.length;j++) {
				if(i==j) continue;
				if(charstr[i]==charstr[j]) {
					System.out.println("both are not unique");
					return;
				}
			}
		}
		
		System.out.println("all characters are unique");
	}
	// complexity is O(n2)) , can I avoid second loop

}
