package com.barrylanceleo.binarysearch;

import java.util.List;

public class RotatedSortedArraySearch {
    private static int binarySearch(final List<Integer> a, int b, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(a.get(mid) == b) {
                return mid;
            }
            else if(a.get(mid) < b) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // DO NOT MODIFY THE LIST
    public static int search(final List<Integer> a, int b) {
        int start = 0;
        int end = a.size()-1;

        // find the rotated place
        int startingPoint = 0;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid+1 == a.size()) {
                break;
            }
            if(a.get(mid) > a.get(mid+1)) {
                startingPoint = mid+1;
                break;
            }
            else if(a.get(start) > a.get(mid)) {
                // this is the rotated parted
                end = mid - 1;
            }
            else {
                // this is the rotated parted
                start = mid + 1;
            }
        }
        // if not rotated the starting point would be 0
        // lets search from 0 to startingPoint -1 and starting point to a.size()-1
        int result = binarySearch(a, b, 0, startingPoint-1);
        if(result == -1) {
            result = binarySearch(a, b, startingPoint, a.size()-1);
        }
        return result;
    }
}
