package com.fundamental;

public class P9 {

	public static void main(String[] args) {
		int count = 0;
        for (int i = 100; i <= 200; i++) {
            
            boolean isNoZero = true;
            int t = i;
            while (t > 0) {
                if (t % 10 == 0) {
                    isNoZero = false;
                    break;
                }
                
                t /= 10;
            }
            
            if (isNoZero) {
                System.out.print(i + " ");
                count++;
            }
            
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        
	}
}
