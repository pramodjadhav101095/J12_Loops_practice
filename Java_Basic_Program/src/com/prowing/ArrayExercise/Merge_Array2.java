package com.prowing.ArrayExercise;

import java.util.Arrays;

public class Merge_Array2 {

	public static void main(String[] args) {
		
		
		int[] array1 = {1,2,3,4};
		int[] array2  = {9,8,7,6};
		
		int []array3=new int[array1.length + array2.length];
	//int[]	result=arrayMege(array1, array2);


	
//public static int[]arrayMege(int[]array1,int[]array2){
	int counter=0;
	
	for(int i=0;i<array1.length;i++) {
		
		array3[i]= array1[i];
		counter++;
		}
	for(int i=0;i<array2.length;i++) {
		
		array3[counter]=array2[i];
		counter++;
	}
	
	System.out.println(Arrays.toString(array3));
	//return array3;}

	}
}
