package com.company.Questions;

import java.util.Scanner;

public class Jumping_the_clouds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n  ; i++) {
            nums[i] = s.nextInt();

        }
        System.out.println(cloud(nums));
    }
    public static int cloud(int[] nums)
    {
        int zero = 0 ;
        int i = 0 ;
        while(true)
        {
            if(i + 2 < nums.length && nums[i+2] == 0)
            {
                i+=2;
            }
            else if( i + 1 < nums.length && nums[i+1] == 0)
            {
                i++;
            }
            else
            {
                break;
            }
            zero++;
        }
        return zero;
    }
}
