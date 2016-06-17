package com.barrylanceleo.strings;

import java.util.ArrayList;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(ArrayList<String> a) {

        if(a.size() == 0) return "";

        String commonPrefix = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            String currentString = a.get(i);
            int j = 0;
            while(j < commonPrefix.length() && j < currentString.length()
                    && commonPrefix.charAt(j) == currentString.charAt(j)) {
                j++;
            }

            if(j == 0) {
                return "";
            }

            commonPrefix  = commonPrefix.substring(0, j);
        }

        return commonPrefix;

    }
}
