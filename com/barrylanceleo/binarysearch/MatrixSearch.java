package com.barrylanceleo.binarysearch;

import java.util.ArrayList;

/**
 * Created by barry on 5/25/16.
 */
public class MatrixSearch {
    public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {

        if(a.size() == 0 || a.get(0).size() == 0) {
            return 0;
        }

        int numRows = a.size();
        int numCols = a.get(0).size();
        int start = 0;
        int end = numRows * numCols - 1;


        while(start <= end) {
            int mid = start + (end-start)/2;
            if(a.get(mid/numCols).get(mid%numCols) == b) {
                return 1;
            }
            else if(b < a.get(mid/numCols).get(mid%numCols)) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return 0;

    }
}
