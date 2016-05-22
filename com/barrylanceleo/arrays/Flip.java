package com.barrylanceleo.arrays;

import java.util.ArrayList;

/**
 * Created by barry on 5/22/16.
 */
public class Flip {
    public static ArrayList<Integer> flip(String A) {

        int maxCount = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int i =0;
        while(i < A.length()) {
            int currCount = 0;
            int currStart = i;
            int currEnd = i;
            while(currCount >= 0 && i < A.length()) {
                if(A.charAt(i) == '0') {
                    currCount++;
                    currEnd = i;
                }
                else {
                    currCount--;
                    currEnd = i;
                }
                if(currCount > maxCount) {
                    maxCount = currCount;
                    maxStart = currStart;
                    maxEnd = currEnd;
                }
                i++;
            }
        }
        ArrayList<Integer> output = new ArrayList<>();
        if(maxCount == 0) {
            return output;
        }
        else {
            output.add(maxStart+1);
            output.add(maxEnd+1);
            return output;
        }
    }
}
