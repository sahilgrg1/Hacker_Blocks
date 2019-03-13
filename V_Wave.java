package com.company.Questions;

import java.util.Scanner;

public class V_Wave {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n  ; j++) {
                nums[i][j] = s.nextInt();

            }

        }
        v_wave(nums);
    }
    public static void v_wave(int[][] nums)
    {
        for (int col = 0; col < nums.length ; col++) {
            if(col % 2 == 0 )
            {
                for (int row = 0; row < nums.length ; row++) {
                    System.out.print(nums[row][col]+" ");

                }
            }
            else
            {
                for (int row = nums.length - 1; row >= 0  ; row--) {
                    System.out.print(nums[row][col]+" ");
                }
            }

        }
    }
}
