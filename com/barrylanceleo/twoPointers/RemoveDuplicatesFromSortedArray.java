package com.barrylanceleo.twoPointers;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(ArrayList<Integer> a) {

        int insertPtr = 0, readPtr = 1;
        while(readPtr < a.size()) {
            if(a.get(insertPtr).equals(a.get(readPtr))) {
                readPtr++;
            }
            else {
                insertPtr++;
                a.set(insertPtr, a.get(readPtr));
                readPtr++;
            }
        }

        // remove the elements after the insertPtr
        for(int i = a.size()-1; i > insertPtr; i--) {
            a.remove(i);
        }
        return a.size();
    }
}
