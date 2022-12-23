package com.practiseexample;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
	
		int i=0;
		System.out.println("Fibonacci series is");
		System.out.print(n1 + " "+n2);
		while(i<5)
		{
			int n3=n1+n2;  //
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
			
			i++;
		}

	}

}
