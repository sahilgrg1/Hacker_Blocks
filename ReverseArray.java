package com.company.Questions;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n  ; i++) {
            nums[i] = s.nextInt();

        }
        reverse(nums);
    }
    public static void reverse(int[] nums)
    {
        int start = 0 ;
        int end = nums.length - 1 ;
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            start++;
            end--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
