package com.practiseexample;

public class Prime {

	public static void main(String[] args) {
		
		for(int x=1; x<=10;x++)
		{
		int count=0;
		for(int i=1; i<=x ; i++)
		{
			if(x % i == 0)
			{
				count++;
			}
			
		}
if(count==2)
{
	System.out.println(x+ " is prime");
	
}

	}
	}
}
