package com.fundamental;

public class P1 {

	public static void main(String[] args) {
		int i,j,k,p,d;
		k=1;
		p=1;
		d=9;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(k=1;k<=d;k++)
			{
				System.out.print(" ");
			}
			for(k=p;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
			d=d-2;
			p=p+1;
		}
		
	}
}
