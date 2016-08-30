package com.barrylanceleo.hashing;

import java.util.HashMap;

/**
 * Created by barry on 8/5/16.
 */
public class Fraction {

    public static String fractionToDecimal(int numerator, int denominator) {

        long numeratorLong = numerator;
        long denominatorLong = denominator;


        // check for division by zero
        if(denominatorLong == 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        HashMap<Long, Integer> seenNumeratorsIndex = new HashMap<>();


        if((numeratorLong < 0 && denominatorLong > 0) || (numeratorLong >= 0 && denominatorLong < 0)) {
            output.append('-');
        }

        //System.out.println(output +" " +numerator +" " +denominator);

        // before decimal
        while(numeratorLong/denominatorLong != 0) {
            if(numeratorLong/denominatorLong < 0) {
                output.append(numeratorLong/denominatorLong * -1);
            }
            else {
                output.append(numeratorLong/denominatorLong);
            }
            numeratorLong %= denominatorLong;
        }

        if(output.toString().equals("") || output.toString().equals("-")) {
            output.append(0);
        }

        // after decimal
        if(numeratorLong != 0) {
            output.append(".");
            long prevNumerator;

            do {
                seenNumeratorsIndex.put(numeratorLong, output.length());
                numeratorLong *= 10;
                if(numeratorLong/denominatorLong < 0) {
                    output.append(numeratorLong/denominatorLong * -1);
                }
                else {
                    output.append(numeratorLong/denominatorLong);
                }
                numeratorLong %= denominatorLong;
            } while(numeratorLong != 0 && !seenNumeratorsIndex.containsKey(numeratorLong));

            if(seenNumeratorsIndex.containsKey(numeratorLong)) {
                output.insert((int)seenNumeratorsIndex.get(numeratorLong), '(');
                output.append(")");
            }
        }

        if(output.toString().equals("-0")) {
            return "0";
        }
        else {
            return output.toString();
        }
    }

}
