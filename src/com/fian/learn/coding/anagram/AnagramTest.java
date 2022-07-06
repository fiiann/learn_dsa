package com.fian.learn.coding.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void anagram() {
        Boolean resultAnagram = Anagram.isAnagramFrequencies("fina", "fian");
        assertTrue(resultAnagram);

        Boolean resultAnagram1 = Anagram.isAnagramFrequencies("secure", "rescue");
        assertTrue(resultAnagram1);

        Boolean resultAnagram2 = Anagram.isAnagramFrequencies("haha", "bjkj");
        assertFalse(resultAnagram2);

        Boolean resultAnagram3 = Anagram.isAnagramFrequencies("hahu", "garfianto");
        assertFalse(resultAnagram3);

        Boolean resultAnagram4 = Anagram.isAnagramFrequencies("a", "a");
        assertTrue(resultAnagram4);

        Boolean resultAnagram5 = Anagram.isAnagramFrequencies("a", "b");
        assertFalse(resultAnagram5);

        Boolean resultAnagram6 = Anagram.isAnagramFrequencies("fian", "fias");
        assertFalse(resultAnagram6);
    }
}