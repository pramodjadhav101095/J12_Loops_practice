package com.prowing.ArrayExercise;

import java.util.Scanner;

public class SumOfElelmentOfArray {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("How Many Element you Want?");
		
		int n	=sc.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Eneter Element:" + (i+1));
			arr[i]=sc.nextInt();
		}

		System.out.println("Array Entered is :");
		
		for(int i=0;i<n;i++) {
			
			System.out.println(arr[i]+"");
			
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			
			sum=sum+arr[1];
		}
			
		System.out.println("Sum of Array :="+ sum);	
	}

	
	
}
