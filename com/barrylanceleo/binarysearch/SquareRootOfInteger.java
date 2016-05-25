package com.barrylanceleo.binarysearch;

public class SquareRootOfInteger {
    public static int sqrt(int a) {
        if(a == 0 || a == 1) {
            return a;
        }
        int start = 1;
        int end = a/2;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid == a/mid || ((mid) < a/(mid) && (mid+1) > a/(mid+1))) {
                return mid;
            }
            else if(mid < a/mid) {
                start = mid + 1;

            }
            else {
                end = mid - 1;
            }
        }
        // this shouldn't happen for positive numbers
        return -1;
    }
}
