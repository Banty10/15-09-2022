package com.array.pll;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		import java.util.Scanner;

		class ArrAvg {

			public void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
				int arrnum[]=new int[5];		
				
				System.out.println("Enter "+arrnum.length + " values");
				for(int i=0;i<arrnum.length;i++) {		
					arrnum[i]=scanner.nextInt();
				}
				
					
				int temp=0;
				
				for(int i=0;i<arrnum.length;i++)	
				{
					
					for(int j=i+1;j<arrnum.length;j++) 		
					{
						if(arrnum[i]>arrnum[j]) 	
						{	
							temp=arrnum[i];
							arrnum[i]=arrnum[j];
							arrnum[j]=temp;
					    }
			       	}
				}
				int sum=0;
				double average=0;
				for(int i=0;i<arrnum.length;i++) 
				{
					sum+=arrnum[i];	
				}
				
				
				
				average=(double)((sum-arrnum[0])-arrnum[arrnum.length-1])/(arrnum.length-2);
				System.out.println("Average except the largest and smallest values : "+average);
				scanner.close();

			}

		}

	}

}
