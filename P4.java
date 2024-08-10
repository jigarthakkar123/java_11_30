package com.fundamental;

public class P4 {

	public static void main(String[] args) {
	int i,j;
	int counter=1;
	for(i=1;i<=20;i=i+2)
	{
		if(counter%2==0)
		{
			System.out.print("-"+i);
		}
		else
		{
			System.out.print(" "+i);
		}
		counter++;
	}
	}
}
