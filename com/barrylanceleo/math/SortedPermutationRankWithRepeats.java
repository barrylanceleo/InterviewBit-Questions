package com.barrylanceleo.math;

import java.util.*;

public class SortedPermutationRankWithRepeats {
    private  static long factorial(int n) {
        long fact = 1;
        for(int i = 1; i <= n; i++){
            if(fact > Long.MAX_VALUE / i) {
                System.out.println("Overflow");
            }
            fact *= i;
        }
        return fact;
    }

    private  static long calculateCombinations(int n, ArrayList<Integer> divisors) {
        Collections.sort(divisors, Collections.reverseOrder());

        long fact = 1;
        int start = n;
        int end = 1;
        if(divisors.size() != 0) {
            end = divisors.get(0);
        }

        for(int i = start; i > end; i--) {
            if(fact > Long.MAX_VALUE / i) {
                System.out.println("Overflow");
            }
            fact *= i;
        }

        for (int i = 1; i < divisors.size(); i++) {
            fact /= factorial(divisors.get(i));
        }

        return fact;

    }

        private static int findPosition(TreeMap<Character, Integer> sortedCharIndexMap, char c) {
        int i = 0;
        for(Map.Entry<Character, Integer> entry: sortedCharIndexMap.entrySet()) {
            if(entry.getKey() == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static ArrayList<Integer> getDivisors(TreeMap<Character, Integer> sortedCharIndexMap, char c) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry: sortedCharIndexMap.entrySet()) {
            if(entry.getKey() == c) {
                divisors.add((entry.getValue() != 1)?entry.getValue()-1:1);
            }
            else {
                divisors.add(entry.getValue());
            }
        }
        return divisors;
    }

    private static void updateData(TreeMap<Character, Integer> sortedCharIndexMap, char c) {
        Iterator<Map.Entry<Character, Integer>> it = sortedCharIndexMap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Character, Integer> entry = it.next();
            if(entry.getKey() == c) {
                int count = entry.getValue();
                if(count > 1) {
                    entry.setValue(count - 1);
                }
                else {
                    it.remove();
                }
            }
        }
    }


    public static int findRank(String a) {
        char [] chars = a.toCharArray();
        Arrays.sort(chars);
        TreeMap<Character, Integer> sortedCharIndexMap = new TreeMap<>();
        for(int i = 0; i < chars.length; i++) {
            Integer prevVal = sortedCharIndexMap.get(chars[i]);
            if(prevVal == null) {
                sortedCharIndexMap.put(chars[i], 1);
            }
            else {
                sortedCharIndexMap.put(chars[i], prevVal+1);
            }
        }

        long rank = 1;
        for(int i = 0 ; i < a.length(); i++) {
            for(Map.Entry<Character, Integer> entry: sortedCharIndexMap.entrySet()) {
                if(entry.getKey() == a.charAt(i)) {
                    break;
                }
                rank = rank + calculateCombinations(a.length() - i -1,
                                getDivisors(sortedCharIndexMap, entry.getKey())) %1000003  ;
                rank %= 1000003;
            }
            updateData(sortedCharIndexMap, a.charAt(i));
        }
        return (int)rank;
    }
}
