package com.assignments;
public class ConditionalOperators {
	public static void main(String args[])
	{	
    	int x=25, y=78,  z=87;
    	if (x>y)
    	{    		if(x>z)    {
    			System.out.println("Greatest number in given numbers is x = " + x);
    							}
    		else    		{
    			System.out.println("Greatest number in given numbers is z = " + z);
    						}
    	}
    	else
    	{    		if(y>z)    		{
    			System.out.println("Greatest number in given numbers is y = " + y);
    								}
    		else
    		{
    			System.out.println("Greatest number in given numbers is z = " + z);
    		}
    	}
		System.out.println("-------------------------------------");
		int a=35;
		int b=-11;
		if(a>=0)
		{
		System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
		if(b>=0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
	}
}
