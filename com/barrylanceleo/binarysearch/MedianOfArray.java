package com.barrylanceleo.binarysearch;

import java.util.List;

/**
 * Created by barry on 5/26/16.
 */
public class MedianOfArray {
    //TODO: This is not a O(m+n) solution, implement a O(log(m+n)) solution
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        if(a.size() == 0 && b.size() == 0) {
            return -1;
        }
        if(a.size() == 0) {
            if(b.size()%2 == 0){
                return (b.get(b.size()/2) + b.get((b.size()/2)-1))/2.0;
            }
            else {
                return b.get(b.size()/2);
            }
        }

        if(b.size() == 0) {
            if(a.size()%2 == 0){
                return (a.get(a.size()/2) + a.get((a.size()/2)-1))/2.0;
            }
            else {
                return a.get(a.size()/2);
            }
        }

        int mid = (a.size() + b.size())/2;
        int i, j;
        int previous = -1, current = -1;
        if(a.get(0) > b.get(0)) {
            i = -1;
            j = 0;
            current = b.get(j);
        }
        else {
            i = 0;
            j = -1;
            current = a.get(i);
        }

        int count = 1;
        while(count <= mid) {
            if((j+1 == b.size())) {
                i++;
                previous = current;
                current = a.get(i);
            }
            else if((i+1 == a.size())){
                j++;
                previous = current;
                current = b.get(j);
            }
            else if(a.get(i + 1) > b.get(j + 1)) {
                j++;
                previous = current;
                current = b.get(j);
            }
            else {
                i++;
                previous = current;
                current = a.get(i);
            }
            count++;
        }

        if((a.size() + b.size())%2 == 0) {
            return (previous + current)/2.0;
        }
        else {
            return current;
        }
    }
}
