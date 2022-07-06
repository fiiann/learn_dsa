package com.fian.learn.coding.anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        isAnagramFrequencies("fian", "fina");
    }

    /**
     * Use for loop
     * Anagram adalah sama hurufnya, jumlahnya, walaupun diacak
     * secure = rescue
     * idenya adalah
     * @param kata1
     * @param kata2
     * @return boolean
     */
    public static Boolean anagramLoop(String kata1, String kata2) {
        Boolean result = false;
        if(kata1.length() != kata2.length()){
            return false;
        }else{
            for (int i = 0; i < kata1.length(); i++) {
                for (int j = 0; j < kata2.length(); j++) {
                    if(kata1.toCharArray()[i] == kata2.toCharArray()[j]){
                        result = true;
                        break;
                    }else{
                        result = false;
                    }
                }
            }
            return result;
        }
    }

    /**
     * Use sort
     * @param kata1
     * @param kata2
     * @return
     */
    public static Boolean isAnagramSort(String kata1, String kata2){
        if(kata1.length() != kata2.length()) return false;

        kata1 = kata1.toLowerCase();
        kata2 = kata2.toLowerCase();

        char[] char_kata1 = kata1.toCharArray();
        char[] char_kata2 = kata2.toCharArray();

        Arrays.sort(char_kata1);
        Arrays.sort(char_kata2);

        return Arrays.equals(char_kata1, char_kata2);
    }

    public static Boolean isAnagramFrequencies(String kata1, String kata2){
        if(kata1.length() != kata2.length()) return false;

        kata1 = kata1.toLowerCase();
        kata2 = kata2.toLowerCase();

        int[] charFrequencies = new int[26];
        for (int i = 0; i < kata1.length(); i++) {
            char currentChar = kata1.charAt(i);
            int index = currentChar-'a';
            charFrequencies[index]++;
        }
        for (int i = 0; i < kata2.length(); i++) {
            char currentChar = kata2.charAt(i);
            int index = currentChar-'a';
            charFrequencies[index]--;
        }

        for (int i = 0; i < 26; i++) {
            if(charFrequencies[i] != 0){
                return false;
            }
        }
        return true;
    }
}
