package com.assignments;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListAssignment {
	public static void main(String[] args) 
	{	
		ArrayList<String> color= new ArrayList<String>();//1 create New Array List
		color.add("Green");
		color.add("Yellow");
		color.add("Orange");
		color.add("white");
		System.out.println("1. New Arraylist" +color);
		color.add(0,"Black");//2 adding at first index
		System.out.println("2. Insert @1st " +color);
		color.add(color.size()-1,"Blue");//2 adding at last index
		System.out.println("2. Insert @last " +color);
		System.out.println("3. Specific index" +(color.get(4)));//3 retrieve an element 
		color.set(2, "Peach"); //4 To update specific array element 
		System.out.println("4. Update" +color);
		System.out.println("5. Remove" +(color.remove(3)));//5 remove 3rd element
		System.out.println(color);
			for(String s1 : color)	//6 to search an element 
			{
				if(s1=="Green")
				{
					System.out.println("6. Element Present " +s1);
				}
			}
		ArrayList<String> rev= new ArrayList<String>();//7 Reverse elements in a array list
		int j=0;
		for(int i=color.size()-1;i>=0;i--)
		{
			rev.add(j,color.get(i));
			j++;
		}
		System.out.println("Original String"+color);
		System.out.println("7. Reversed" +rev);
		System.out.println("8. Extract portion"+ (color.subList(1, 3)));//8. To extract a portion of a array list
		Collections.swap(color, 1, 2);
		System.out.println("9. After swapping" +color);
		color.trimToSize();//11 To trim the virtual capacity of an array list the current list size
		System.out.println("11. Trim VC: color.trimToSize()");
		for(int i=0;i<color.size();i++)//12.To print all the elements using position
		{
			System.out.println("12. Color with index "+color.get(i)+ " " +i);
		}
		color.clear();//10. to empty arraylist
		System.out.println("10. Clear"+ color);
	}
}
