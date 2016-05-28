package com.barrylanceleo.strings;

/**
 * Created by barry on 5/27/16.
 */
public class StrStr {
    public static int strStr(final String haystack, final String needle) {

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while(j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
            }
            if(j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
