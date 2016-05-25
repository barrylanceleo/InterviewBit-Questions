package com.barrylanceleo.math;

import java.util.Arrays;

public class SortedPermutationRank {
    private  static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = (fact * i) % 1000003;
        }
        return fact;
    }

    private static int findIndexAndRemove(StringBuilder word, char c) {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == c) {
                word.deleteCharAt(i);
                return i;
            }
        }
        return -1;
    }

    public static int findRank(String a) {
        char [] chars = a.toCharArray();
        Arrays.sort(chars);
        StringBuilder sortedWord = new StringBuilder(new String(chars));
        int rank = 1;
        for(int i = 0 ; i < a.length(); i++) {
            rank = rank + (findIndexAndRemove(sortedWord, a.charAt(i)) *  factorial(a.length() - i -1))  % 1000003;
            rank %= 1000003;

        }
        return rank;
    }
}
