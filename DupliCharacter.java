package com.company.Questions;

import javax.print.DocFlavor;
import java.util.Scanner;

public class DupliCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        dupli("",line);

    }
    public static void dupli(String pro , String unpro)
    {
        if(unpro.length() < 2)
        {
            System.out.println(pro+unpro);
            return;
        }
        if(unpro.charAt(0) == unpro.charAt(1))
        {
            dupli(pro+unpro.charAt(0)+"*" , unpro.substring(1));
        }
        else
        {
            dupli(pro+unpro.charAt(0) , unpro.substring(1));
        }
    }
}
