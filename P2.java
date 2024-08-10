package com.fundamental;

public class P2 {

	public static void main(String[] args) {
		int a,b,c,d,p,k;
		p=65;
		k=5;
		for(a=1;a<=5;a++)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print(a);
			}
			for(c=k;c>=1;c--)
			{
				System.out.print((char)p);
			}
			System.out.println();
			k=k-1;
			p=p+1;
		}
	}
}
