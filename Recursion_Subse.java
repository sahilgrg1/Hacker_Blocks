package com.company.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Recursion_Subse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0) {
            ArrayList<String> list = new ArrayList<>();
         String line = s.next();
            subse("", line, list);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }
        }

    }
    public static void subse(String pro , String unpro , ArrayList<String> list)
    {
        if(unpro.isEmpty())
        {
            if(!pro.isEmpty())
            {
                list.add(pro);
            }
            return ;
        }
        char ch = unpro.charAt(0);
        unpro = unpro.substring(1);
        subse(pro,unpro,list);
        subse(pro+ch,unpro,list);


    }

}
