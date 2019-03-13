package com.company.Questions;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(interval(n1,n2));
    }
    public static int interval(int n1, int n2)
    {
        int sum = 0 ;
        for (int i = n1; i <= n2 ; i++) {
            sum = sum +count(i);

        }
        return sum ;
    }

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            if((n&1) == 1)
            {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
