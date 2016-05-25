package com.barrylanceleo.binarysearch;

import java.util.ArrayList;

public class SortedInsertPosition {
    public static int searchInsert(ArrayList<Integer> a, int b) {
        if(a.size() == 0) {
            return 0;
        }
        int start = 0;
        int end = a.size()-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(a.get(mid) == b) {
                return mid;
            }
            else if((mid == 0 || a.get(mid-1) < b) && a.get(mid) > b) {
                return mid;
            }
            else if(a.get(mid) < b) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return a.size();
    }
}
