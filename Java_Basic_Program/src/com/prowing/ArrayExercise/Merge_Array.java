package com.prowing.ArrayExercise;

public class Merge_Array {

	public static void main(String[] args) {
	
		
		int num[]= {1,2,3};
		int num1[]= {4,5,6};
		
	int[]result	=merge(num1,num);
	
	for(int n: result) {
		System.out.println(n+"");
	}
	}
		public static int[]merge(int[]num1,int[]num){
			
			int[]mergeArray=new int[num.length+num1.length];
			
			for(int i=0;i<num.length;i++) {
				mergeArray[i]=num[i];
				
			}
			int counter=0;
			for(int i=num.length;i<(num.length+num1.length);i++) {
				mergeArray[i]=num1[counter];
				counter++;
			}
			return mergeArray;
		}

	}


