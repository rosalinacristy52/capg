package com.capg.day5;
import java.util.Scanner;
	public class LargestNumber {

		public static void main(String[] args) {
		   @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		   int arr[]=new int[10];
		   
		   System.out.println("Enter 5 Elements");
		   for(int i=0;i<5;i++)
		   arr[i]=s.nextInt();
		   int Largest=arr[0];
		   for(int i=1;i<5;i++)
		   {
			   if(arr[i]>Largest) 
			   {
			   
			   Largest=arr[i];
			   }
		   }
		   System.out.println(Largest);
		

		}

	}

