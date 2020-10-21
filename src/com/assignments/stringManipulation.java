package com.assignments;

public class stringManipulation {

	public static void main(String[] args) {
		String actual="Sowmya";
		String expected= "Priya";
		if(actual.equals(expected))//1. check two different strings equality 
		{
			System.out.println("1. String are equal "+actual);
				}
		else
		{
			System.out.println("1. String are not equal "+actual);
		}
		String s1="         Hello      Everyone       ";//2. Remove all  spaces
		System.out.println("2. Remove all white spaces "+(s1.trim().replace(" ", "")));
		System.out.println("3. First character of string "+expected.charAt(0) +" "+expected);//3.print out the last character and first character
		System.out.println("3. Last character of string " +(expected.charAt(expected.length()-1))+" "+expected);
		 if(s1.contains(expected))//4. verify a word or a character contained in the sentence
		 {
			 System.out.println("4. "+expected+" is available in "+(s1.trim().replace("      ", " ")));
		 }
		 else
		 {
			 System.out.println("4. "+expected+" is not available in "+(s1.trim().replace("      ", " ")));
		 }
		 String rev=""; //5. method to reverse your own name
		 for(int i=expected.length()-1;i>=0;i--)
		 {
			 rev=rev+expected.charAt(i);
		 }
		 System.out.println("5.Reversed string is"+rev);
		 String s2="Welcome to the best place to learn automation NaveenAutomationLabs";//6. program that gives you the last half of the string.
		 int p=s2.length()/2;
		System.out.println("6. last half of the string "+s2.substring(p));
		 
		 System.out.println("7. 3rd occurance of e "+s2.indexOf('e', (s2.indexOf('e', s2.indexOf('e')+1))+1)); //7. get the 3rd  “ e “ of the string
		 
		if(s2.contains("z"))	//8.which gives an index of (-1) if string is not available
		{
			System.out.println("8+ Given string index is"+s2.indexOf("z"));
		}
		else
		{
			System.out.println("8. "+-1);

		}
		String sa[]=s2.split(" "); //9.breaks a whole string into small strings, and prints out its all values
		System.out.println("9. Splitting strings to arrays");
		for(int i=0;i<sa.length;i++)
		{
			System.out.println(sa[i]);
		}
		String s3="Hello welcome priya";//10. Assume that a string consists of 3 words, print out the middle one.
		String sa1[]=s3.split(" ");
			System.out.println("10. Printing middle word from string "+sa1[1]);
			
		String s4="your transaction id is: 12345 and reference id is 34567";  //11.get only numeric part from this String
		System.out.println("11.First numeric part "+s4.substring(24, 29));
		System.out.println("11.Last numeric part "+s4.substring(50));

	}
	

}
