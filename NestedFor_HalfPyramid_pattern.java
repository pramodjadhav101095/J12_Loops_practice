package com.prowings.Loops;

public class NestedFor_HalfPyramid_pattern {

	public static void main(String[] args) {

		// program to create a half pyramid pattern using nested loops.

		for (int i = 1; i <= 5; ++i) {
		//	System.out.println("i =" + i );
		
		for(int j=1; j<= i;++j) 
			System.out.print( i+" ");
			
			
		
		System.out.println("" );
		}

	}

}
