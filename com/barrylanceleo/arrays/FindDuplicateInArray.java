package com.barrylanceleo.arrays;

import java.util.HashSet;
import java.util.List;

/**
 * Created by barry on 5/21/16.
 */
public class FindDuplicateInArray {

    public static int repeatedNumber(final List<Integer> a) {
        HashSet<Integer> numList = new HashSet<>();
        for(int i = 0; i < a.size(); i++) {
            if(!numList.add(a.get(i))) {
                return a.get(i);
            }
        }
        return -1;
    }
}
