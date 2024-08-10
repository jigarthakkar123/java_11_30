package com.fundamental;

public class P6 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<10;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
