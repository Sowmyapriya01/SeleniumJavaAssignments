package com.assignments;
public class ArraysAssignment {
	public static void main(String[] args) {
    for(int i=0;i<=3;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(i+""+j+ " ");
			}
			System.out.println();
		}
		System.out.println("Player Name||age||TeamName||DOB||Gender||Strike Rate||");
		Object[] p1=new Object[6];
			p1[0]="Player1";
			p1[1]=26;
			p1[2]="India";
			p1[3]="27-Jun-1994";
			p1[4]="M";
			p1[5]=45.99;
			for(Object x : p1)
			{
				System.out.print(x+ "||");
			}
			System.out.println();
		Object[] p2=new Object[6];
		p2[0]="Player2";
		p2[1]=28;
		p2[2]="India";
		p2[3]="27-Jun-1992";
		p2[4]="M";
		p2[5]=95.99;
		for(int y=0;y<p2.length;y++)
		{
			System.out.print(p2[y]+ "||");
		}
		System.out.println();
		Object[] p3=new Object[6];
		p3[0]="Player3";
		p3[1]=30;
		p3[2]="India";
		p3[3]="27-Jun-1990";
		p3[4]="M";
		p3[5]=110;
		for(Object z : p3)
		{
			System.out.print(z+ "||");
		}
		System.out.println();
		Integer[] in= {0,1,2,3,4};
		for(int m=in.length-1;m>=0;m--)
		{
			System.out.println("n = "+in[m]);
		}
	}

}
