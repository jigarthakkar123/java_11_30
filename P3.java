package com.fundamental;

public class P3 {

	public static void main(String[] args) {
		int a=0,b=1,c=2,n=10,i,sum=0;
		System.out.print(a+" "+b+" "+c+" ");
		for(i=1;i<=n;n++)
		{
			sum=a+b+c;
			System.out.print(sum+" ");
			a=b;
			b=c;
			c=sum;
		}
	}
}
