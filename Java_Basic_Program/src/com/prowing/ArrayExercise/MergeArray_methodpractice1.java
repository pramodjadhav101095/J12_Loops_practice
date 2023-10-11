package com.prowing.ArrayExercise;

import java.util.Arrays;

public class MergeArray_methodpractice1 {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4};
		
		int []array2= {9,8,7,6};

	arrayMerge(array1,array2);


	}

	public static int[]arrayMerge(int[]array1,int[]array2)
	
	{
		int[]merge=new int[array1.length+array2.length];
		int counter=0;
		for(int i=0;i<array1.length;i++) {
			
			merge[counter]=array1[i];
			counter++;
		}
		for(int i=0;i<array2.length;i++) {
			
			merge[counter]=array2[i];
			counter++;
		}
		System.out.println(Arrays.toString(merge));
		return merge;
	}

}
