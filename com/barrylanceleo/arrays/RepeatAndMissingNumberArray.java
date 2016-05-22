package com.barrylanceleo.arrays;

import java.util.ArrayList;
import java.util.List;

public class RepeatAndMissingNumberArray {
    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        ArrayList<Boolean> flags = new ArrayList<>();
        // initialize the flags with zero
        for(int i = 0; i < a.size(); i++) {
            flags.add(false);
        }

        int repeatingNum = -1, missingNum = -1;
        for(int i = 0; i < a.size(); i++) {
            int currNum = a.get(i);
            if(flags.get(currNum-1)) {
                // found repeating num
                repeatingNum = currNum;
            }
            else {
                flags.set(currNum-1, true);
            }
        }

        // find the missing number
        for(int i = 0; i < a.size(); i++) {
            if(!flags.get(i)) {
                missingNum = i + 1;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeatingNum);
        result.add(missingNum);
        return result;
    }
}
