package com.barrylanceleo.math;

public class ExcelColumnTitle {
    public static String convertToTitle(int a) {
        StringBuilder outputBuilder = new StringBuilder();
        while(a > 0) {
            a--;
            outputBuilder.insert(0, (char)('A' + (a % 26)));
            a /= 26;
        }
        return outputBuilder.toString();
    }
}
