package com.fundamental;

public class P7 {

	public static void main(String[] args) {
		int i,j,num=15;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num+"   ");
				num--;
			}
			System.out.println();
		}
	}
}
