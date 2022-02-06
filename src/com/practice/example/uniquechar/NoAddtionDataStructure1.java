package com.practice.example.uniquechar;

public class NoAddtionDataStructure1 {
	
	
	public static void main(String args[]) {
		
		boolean[] booleanChar=new boolean[128];
		String str="sdjklafndslk;fnsdlk;fndsl;kafnsdal;kfndsalk;fnl;dksfnl;dksanflksdanfhiwqpue";
		
		for(int i=0;i<str.length();i++) {
			char val=str.charAt(i);
			if(booleanChar[val]) {
				System.out.println("does not contain unique char");
				break;
			}
			booleanChar[val]=true;
		}
		System.out.println("all characters are unique");
		
	}

}
