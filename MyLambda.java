package com.capg.day8;
	interface Lambda{
		
		public void print();
	}
	interface SumInterface{
		public void sum(int a,int b);
	}
	interface SubInterface {
		public void sub(int d,int e);
	}

	public class MyLambda {

		public static void main(String[] args) {
			Lambda result=()->System.out.println("hello java lambda");
			result.print();
			
			SumInterface sumInterface=(int a,int b)->{int c= a+b;
			System.out.println(c);
			
			
			};
			sumInterface.sum(10, 10);
			
			SubInterface subInteface=(int d,int e)->{int f= d-e;
			System.out.println(f);
			};
			subInteface.sub(20, 10);
		 	

		}
		

	}

