package com.company.Questions;

import javax.print.DocFlavor;
import java.util.Scanner;

public class BoardDice
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        dice("",n,t);
        System.out.println("\n"+dicecount("",n,t));
    }
    public static void dice(String pro , int n , int target)
    {
        if(n == 0)
        {
            System.out.print(pro+" ");
        }
        for (int i = 1; i <= n && i <= target ; i++) {
            dice(pro + i , n - i,target );

        }
    }
    public static int dicecount(String pro , int n , int target)
    {
        if(n == 0)
        {
            return 1;
        }
        int sum = 0 ;
        for (int i = 1; i <= target && i <= n ; i++) {
            sum += dicecount(pro + i , n - i,target );

        }
        return sum ;
    }
}

