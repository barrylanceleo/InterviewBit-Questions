package com.barrylanceleo.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class SearchForARange {
    public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> output = new ArrayList<>();

        // find the starting point
        int start = 0;
        int end = a.size()-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if((mid == 0 || a.get(mid - 1) < b) && a.get(mid) == b) {
                output.add(mid);
                break;
            }
            else if(b <= a.get(mid)) {
                end = mid - 1;
            }
            else {
                start = mid +1;
            }
        }

        // find the ending point
        start = 0;
        end = a.size()-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(a.get(mid) == b && (mid == a.size()-1 || a.get(mid +1) > b)) {
                output.add(mid);
                break;
            }
            else if(b >= a.get(mid)) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // if not found
        if(output.size() == 0) {
            output.add(-1);
            output.add(-1);
        }

        return output;

    }
}
