package com.company.Questions;

import java.util.Scanner;

public class Increasion_Seq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n ; i++) {
            nums[i] = s.nextInt();

        }
        System.out.println(inctodec(nums));
    }
    public static boolean inctodec(int[] nums)
    {
        boolean s = false;
        System.out.println("nice");
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] > nums[i-1] && s == false)
            {
                s = true;
            }
            if(nums[i] < nums[i-1] && s) {
                return false;
            }
            if(nums[i] == nums[i-1] )
            {
                return false;
            }


        }
        return true;
    }
}
