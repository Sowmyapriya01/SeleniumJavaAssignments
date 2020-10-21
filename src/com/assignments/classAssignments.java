package com.assignments;

public class classAssignments {
	public static void main(String[] args) 
	{
		//StringManipulationConcept 
	String s = "This is my java code and i am so happy";
	System.out.println("1st occurrence of s"+ (s.indexOf("s")));//1st occurrence of s
	System.out.println("2nd occurrence of s"+(s.indexOf("s", s.indexOf("s")+1)));//2nd occurrence of s
	System.out.println("3rd occurrence of s"+(s.indexOf("s", ((s.indexOf("s", s.indexOf("s")+1))+1))));//3rd occurrence of s
		//To avoid NumberFormatException
	String y = "100test";
	int p = Integer.parseInt(y.substring(0, 3));
	System.out.println("p value is "+(p+20));//120
	int q = Integer.parseInt((y.split("t")[0]));
	System.out.println("q value is " +(q+20));//120
	int r = Integer.parseInt((y.substring(y.indexOf("1"),y.length()-4)));
	System.out.println("r value is "+(r+20));//120
	}
}
