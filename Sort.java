package com.array.pll;

import java.util.Scanner;

public class Sort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int nums[]=new int[5];
	String names[] = new String[5];
	
	System.out.println("Enter " + names.length + " String values: ");
	for(int i=0; i<names.length; i++) {
		names[i] = sc.nextLine();  
	}
	System.out.println("Enter " + nums.length + " Numeric values: ");
	for(int i=0; i<nums.length; i++) 
		nums[i] = sc.nextInt();
	
	//sorting numeric
	
	System.out.println("Numeric Values before sorting: ");
	for(int i=0; i<nums.length; i++)
		System.out.println(nums[i]);
	//sorting string
	System.out.println("String values Before Sorting :");
	for(int i= 0;i<names.length;i++) {
		System.out.println(names[i]);
	}
	
	for(int i=0; i<names.length; i++) {
		for(int j=i+1;j<names.length;j++) {
		if(names[i].compareTo(names[j])>0){
			String temp= names[i];
			names[i]=names[j];
			names[j]=temp;
		}
		}
	}
	for(int i=0; i<nums.length; i++) {
		for(int j=i+1; j<nums.length; j++) {
			if(nums[i] > nums[j]) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
	}

	
	System.out.println("Values after sorting in ascending order:");
	for(int i=0; i<nums.length; i++)
		System.out.println(nums[i]);
	
	System.out.println("String value After Sorting :");
	for(int i= 0;i<names.length;i++) {
		System.out.println(names[i]);
	}
	sc.close(); 
}}
