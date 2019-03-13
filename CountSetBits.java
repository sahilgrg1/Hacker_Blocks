package com.company.Questions;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
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
