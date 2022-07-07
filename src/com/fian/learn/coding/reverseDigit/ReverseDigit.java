package com.fian.learn.coding.reverseDigit;

import java.util.Collection;
import java.util.Collections;

public class ReverseDigit {
    public static void main(String[] args) {
        reverseStringWithSwap("fian");
    }

    public static int reverseDigits(int x) {
        int reverse = 0;
//        1234
        while(x != 0){
            int remain = x % 10; // isolate the last digit
            reverse = reverse * 10 + remain; //append last digit to reverse
            x = x/10; // remove last digit
        }
        return reverse;
    }

    public static String reverselString(String kata){
        int jumlah = kata.length();
        String result="";
        char ch;
        for (int i = 0; i < jumlah; i++) {
            ch = kata.charAt(i);
            result = ch+result;
        }
        return result;
    }

    public static String reverselString2(String kata){
        int jumlah = kata.length();
        String result="";
        char ch;
        for (int i = jumlah-1; i >= 0; i--) {
            ch = kata.charAt(i);
            result = result+ch;
        }
        return result;
    }

    public static String reverseStringWithSwap(String kata){
        int jumlah = kata.length()-1;
        int end = jumlah;
        for (int i = 0; i < jumlah/2; i++) {
//                System.out.println("i = "+i+" j = "+end);
                swap(kata, i, end);
//                System.out.println(kata);
                end++;
        }
        return kata;
    }
    private static char[] swap(String kata, int i, int j){
        char[] chars = kata.toCharArray();
        char temp = chars[i];
        chars[i]= chars[j];
        chars[j] = temp;
        return chars;
    }
}
