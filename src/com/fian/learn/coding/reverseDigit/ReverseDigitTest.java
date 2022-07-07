package com.fian.learn.coding.reverseDigit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseDigitTest {

    @Test
    void reverseDigits() {
//        System.out.println("Reverse Digit : ");
//        int reverse = ReverseDigit.reverseDigits(1589);
//        assertEquals(9851, reverse);
//
//        int reverse1 = ReverseDigit.reverseDigits(1234);
//        assertEquals(4321, reverse1);
        String original = "api";
        String kata = ReverseDigit.reverselString2(original);
        System.out.println("Original : "+original);
        System.out.println("Result : "+kata);
        assertEquals("ipa", kata);
    }
}