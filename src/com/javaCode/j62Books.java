package com.javaCode;

public class j62Books {
	String bookName;
	String bookType;
	int price;
	
	public static void main(String args[])
	{
		j62Books b1=new j62Books();
		b1.bookName="Ikigai";
		b1.bookType="Non fiction";
		b1.price=500;
		j62Books b2=new j62Books();
		b2.bookName="It's not your story";
		b2.bookType="fiction";
		b2.price=250;
		j62Books b3=new j62Books();
		b3.bookName="Journal";
		b3.bookType="Square grid";
		b3.price=350;
		j62Books b4=new j62Books();
		b4.bookName="Notebook";
		b4.bookType="Unruled";
		b4.price=120;
		System.out.println(b1.bookName+" "+b1.bookType+" "+b1.price);
		System.out.println(b2.bookName+" "+b2.bookType+" "+b2.price);
		System.out.println(b3.bookName+" "+b3.bookType+" "+b3.price);
		System.out.println(b4.bookName+" "+b4.bookType+" "+b4.price);

	}

}
