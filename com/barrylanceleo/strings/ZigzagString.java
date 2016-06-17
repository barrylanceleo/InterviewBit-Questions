package com.barrylanceleo.strings;

public class ZigzagString {

    public static String convert(String a, int b) {
        if(b == 1) {
            return a;
        }
        StringBuilder resultBuilder = new StringBuilder();

        for(int i = 0; i < b; i++) {
            int j = i;
            while(j < a.length()) {
                resultBuilder.append(a.charAt(j));
                // if first line
                if(i == 0) {
                    j += (b - i - 1)*2;
                    continue;
                }
                else {
                    // if last line
                    if(i == b - 1) {
                        j += i*2;
                        continue;
                    }
                    else {
                        j += (b - i - 1)*2;
                        if(j < a.length()) {
                            resultBuilder.append(a.charAt(j));
                            j += i*2;
                        }
                    }
                }
            }
        }

        return resultBuilder.toString();

    }
}
