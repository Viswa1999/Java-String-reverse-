package mypack;

import java.io.*;
import java.util.*;

public class Solutions {

    public static void main(String[] args) {
        
        String reverse = "";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
        int length = A.length();
        for (int i = length-1;i>=0;i--) {
            reverse = reverse + A.charAt(i);
        }
        if (A.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.print("No");
        }
    }
}