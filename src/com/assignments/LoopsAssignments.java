package com.assignments;

public class LoopsAssignments {

	public static void main (String args[])
	{
		System.out.println("1st program");
		for(int i=0;i<5;i++)
		{
			System.out.println("I am Batman");
		}
		
		System.out.println("2nd Program");
		for(int i=1;i<=9;i++)
		{
			System.out.println("I am Batman" + i);
		}
		System.out.println("3rd program 'for, while, dowhile'");
		for(int j=10;j>=1;j--)
		{
			System.out.println(j);
		}
		System.out.println("while");
		int k=10;
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		System.out.println("do while");
		int l=10;
		do
		{
			System.out.println(l);
			l--;
		}
		while(l>0);
		
	}
	
	
}
