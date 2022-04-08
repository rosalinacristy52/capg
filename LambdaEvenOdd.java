package com.capg.day8;
interface modLambda
{
		public void print(int i);
}

interface modLambda1 
{
	public void evennum(int a);
}

public class LambdaEvenOdd {
	
	public static void main(String[] args) {
		

		Lambda result= () -> System.out.println("Hello Java lambda");
		result.print();
		
		modLambda modLambda=(int a) ->
		{
			if(a%2==0)
			System.out.println("it is even"+a);
			System.out.println("it is odd"+a);
		};
		
		modLambda.print(10);
	}

}
