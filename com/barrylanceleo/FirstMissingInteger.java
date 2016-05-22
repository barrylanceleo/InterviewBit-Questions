package com.barrylanceleo;

import java.util.ArrayList;

/**
 * Created by barry on 5/21/16.
 */
public class FirstMissingInteger {
    public static int firstMissingPositive(ArrayList<Integer> a) {

        // order the numbers
        int i = 0;
        while(i < a.size()) {
            //if in correct position or
            if(a.get(i) == i + 1) {
                i++;
            }
            else if(a.get(i) > 0 && a.get(i) <= a.size()) {
                int currentNum = a.get(i);
                // if the value in the corresponding position is the same
                // -- handles repetition
                if(currentNum == a.get(currentNum-1)) {
                    i++;
                }
                else {
                    a.set(i, a.get(a.get(i)-1));
                    a.set(currentNum-1, currentNum);
                }
            }
            else {
                i++;
            }
        }

        // find the first missing positive
        for(i = 0; i < a.size(); i++) {
            if(a.get(i) != i+1) {
                return i+1;
            }
        }
        return a.size()+1;
    }

}
