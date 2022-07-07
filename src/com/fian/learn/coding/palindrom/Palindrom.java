package com.fian.learn.coding.palindrom;

public class Palindrom {
    public static void main(String[] args) {

    }

    // KATAK
    // FIAN
    public static boolean isPalindrom(String kata){
        boolean result = true;
        for (int i = 0; i < kata.length()/2; i++) {
            if(kata.charAt(i) != kata.charAt(kata.length()-1-i)){
                result = false;
                break;
            }
        }
        return result;
    }
}
