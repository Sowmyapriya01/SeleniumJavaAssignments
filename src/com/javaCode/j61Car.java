package com.javaCode;

public class j61Car {
		String name;
		String color;
		int price;
		String model;
		String type;
		public static void main(String args[])
		{
		j61Car c1=new j61Car();
		c1.name="Audi";
		c1.color="Green";
		c1.price=10000000;
		c1.model="2010";
		c1.type="Automatic";
		j61Car c2=new j61Car();
		c2.name="Titanium";
		c2.color="Orange";
		c2.price=150000;
		c2.model="Eco Sport";
		c1.type="Manual";
		j61Car c3=new j61Car();
		c3.name="Hundai";
		c3.color="Black";
		c3.price=500000;
		c3.model="2009";
		System.out.println(c1.name+ " "+c1.color+ " "+c1.price+ " "+c1.model+ " "+c1.type );
		System.out.println(c2.name+ " "+c2.color+ " "+c2.price+ " "+c2.model+ " "+c2.type );
		System.out.println(c3.name+ " "+c3.color+ " "+c3.price+ " "+c3.model+ " "+c3.type );

		
		}
		
 
}
