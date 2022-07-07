package com.fian.learn.coding.palindrom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {

    @Test
  void isPalindrom(){
      boolean isPalindrom = Palindrom.isPalindrom("fian");
      assertFalse(isPalindrom);

        boolean isPalindrom1 = Palindrom.isPalindrom("katak");
        assertTrue(isPalindrom1);
  }

}