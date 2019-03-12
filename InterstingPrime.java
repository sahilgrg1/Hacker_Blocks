package com.company.Questions;

import java.util.ArrayList;
import java.util.Scanner;


public class InterstingPrime
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Long n = s.nextLong();
        if(n>=2) {
            if (n % 2 == 0 && n != 2) {
                System.out.println(2);
            } else if (isPrime(n) || n == 2) {
                System.out.println(1);
            } else if (isPrime(n - 2)) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

    }
    public static boolean isPrime(Long n )
    {
        for (long i = 2; i * i < n  ; i++) {
            if(n%i == 0 )
            {
                return false;
            }

        }
        return true;
    }
}