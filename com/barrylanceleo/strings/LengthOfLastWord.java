package com.barrylanceleo.strings;

public class LengthOfLastWord {

    public static int lengthOfLastWord(final String a) {
        int prevLength =0, currentLength = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' ') {
                if(currentLength != 0) {
                    prevLength = currentLength;
                    currentLength = 0;
                }
            }
            else {
                currentLength++;
            }
        }
        if(currentLength == 0) {
            return prevLength;
        }
        else {
            return currentLength;
        }
    }
}
