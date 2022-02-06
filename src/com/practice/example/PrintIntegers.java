package com.practice.example;

public class PrintIntegers {

	
	//print all positive integers where a3+b3=c3+d3 where ab,b,c,d are from 1 to 1000
	
	public static void main(String args[]) {
		for (int a=1;a<=1000;a++) {
			
			for (int b=1;b<=1000;b++) {
				for (int c=1;c<=1000;c++) {
					for (int d=1;d<=1000;d++) {
						if((a*a*a)+(b*b*b) == (c*c*c) +(d*d*d)) {
							System.out.println(a+"+"+b+"="+c+"+"+d);
						}
					}
				}
			}
			
		}
	}
}
