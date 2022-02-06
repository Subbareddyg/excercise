package com.practice.example.permitations;
//Given two strings, write a method to decide if one is a permutation of the other.
//String a="dabclkm" ,String b="abcdmkl"
public class AStringisPermitationofOther {
/*
 *Both string be same length if not both are not permutation of each other
 *  sort both and if both are it equal then permutations .complexity is O(NlogN)
 *  need to reduce complexity to O(N) atleast if possible
 *   keep the first string in hashmap with key ,value
 *   for the second string iterate and keep removing the matches from hashmap 
 *   but problem is if there are duplicates which are not allowed in hashmap this may not work
 *  iterate on first string, We can try removing characters from second string until we find a match 
 *  if no match then its a permutation , if there is match keep removing . 
 *  if we reach end of first string its a permutation 
 */
	
	
	/* 
	 * Algorithm 
	 * str1="dabclkm"
	 * str2="abcdmkl"
	 * for i=0 to length of first string
	 *     str2.findchar[char[i]]
	 */
	
	public static void main(String args[]) {
		String str1="dabclkm";
		String str2="abcdmkl";
		
		for (int i=0;i<str1.length();i++) {
			char a=str1.charAt(i);
			if(str2.lastIndexOf(a)>=0) {
				str2= replacedChar(Character.toString(a),str2);
			}else {
				System.out.println("String 2 is not a permutation of String1");
				break;
			}
		}		
		System.out.println("String2 is a combination of String1");
	}
	
	public static String replacedChar(String a, String str2) {
		str2=str2.replace(a, "");
		return str2;
	}
	
	
}
