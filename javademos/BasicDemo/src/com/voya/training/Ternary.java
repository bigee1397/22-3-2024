package com.voya.training;

public class Ternary {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 30;
		int z = 20;
		
		String res = (x>y && x>z) ? "x is greater" :
						y>z ? "y is greater" : 
							"z is greater";
		System.out.println(res);
	}
}
