package com.prowings.Loops;

public class NestedFor_halfpyramid {
	//class Main {
		  public static void main(String[] args) {

		    int rows = 5;

		    // outer loop
		    for (int i = 1; i <= rows; ++i) {

		      // inner loop to print the numbers
		      for (int j = 1; j <= i; ++j) 
		        System.out.print(i+ " ");
		      
		      System.out.println("");
		    }
		  }
		}


