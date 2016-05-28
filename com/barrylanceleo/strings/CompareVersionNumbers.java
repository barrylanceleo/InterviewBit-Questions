package com.barrylanceleo.strings;

public class CompareVersionNumbers {
    public static int compareVersion(String a, String b) {
        int output = 0;
        int aPtr = 0, bPtr = 0;
        while(output == 0) {

            if(aPtr >= a.length() && bPtr >= b.length()) {
                return output;
            }
            // get a number from the first version number
            StringBuilder aSb = new StringBuilder();
            while(aPtr < a.length() && a.charAt(aPtr) != '.') {
                aSb.append(a.charAt(aPtr));
                aPtr++;
            }

            // get a number from the second version number
            StringBuilder bSb = new StringBuilder();
            while(bPtr < b.length() && b.charAt(bPtr) != '.') {
                bSb.append(b.charAt(bPtr));
                bPtr++;
            }

            // move past the dots
            aPtr++;
            bPtr++;

            // make both the numbers have equal number of digits
            if(aSb.length() > bSb.length()) {
                for(int k = 0; k < aSb.length() - bSb.length(); k++) {
                    bSb.insert(0, '0');
                }
            }
            else if(aSb.length() < bSb.length()) {
                for(int k = 0; k < bSb.length() - aSb.length(); k++) {
                    aSb.insert(0, '0');
                }
            }

            int i = 0;
            while(output == 0 && i < aSb.length()) {
                if(aSb.charAt(i) == bSb.charAt(i)) {
                    i++;
                }
                else if(aSb.charAt(i) > bSb.charAt(i)) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        }
        return 0;
    }
}
