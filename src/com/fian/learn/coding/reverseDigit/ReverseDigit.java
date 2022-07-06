package com.fian.learn.coding.reverseDigit;

public class ReverseDigit {
    public static void main(String[] args) {

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
}
