package com.company.Questions;

import java.util.Scanner;

public class Numpad_Rec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        numpad("", line);
        System.out.println("\n"+count("",line));
    }

    public static void numpad(String pro, String unpro) {
        if (unpro.isEmpty()) {
            System.out.print(pro + " ");
            return;
        }
        int d = Integer.parseInt(unpro.substring(0, 1));
        unpro = unpro.substring(1);
        for (int i = 3 * (d - 1); i < 3 * d; i++) {
            if (i == 26) {
                break;
            }
            char ch = (char) ('a' + i);
            numpad(pro + ch, unpro);

        }
    }
    public static int count(String pro, String unpro) {
        if (unpro.isEmpty()) {

            return 1;
        }
        int sum = 0 ;
        int d = Integer.parseInt(unpro.substring(0, 1));
        unpro = unpro.substring(1);
        for (int i = 3 * (d - 1); i < 3 * d; i++) {
            if (i == 26) {
                break;
            }
            char ch = (char) ('a' + i);
           sum += count(pro + ch, unpro);

        }
        return sum ;
    }
}
