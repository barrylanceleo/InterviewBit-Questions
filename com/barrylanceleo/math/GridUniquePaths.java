package com.barrylanceleo.math;

import java.util.ArrayList;

/**
 * Created by barry on 5/23/16.
 */
public class GridUniquePaths {

    public static int uniquePaths(int a, int b) {
        if(a == 0) {
            return 1;
        }
        if(b == 0) {
            return 0;
        }
        ArrayList<ArrayList<Integer>> pathMatrix = new ArrayList<>();
        // initialize the matrix with ones along the  first row and column
        for(int i = 0; i < a; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            pathMatrix.add(row);
        }

        ArrayList<Integer> firstRow = pathMatrix.get(0);
        for(int i = 1; i < b; i++) {
            firstRow.add(1);
        }

        // calculate the number of paths
        for(int i = 1; i < a; i++) {
            for(int j = 1; j < b; j++) {
                pathMatrix.get(i).add(pathMatrix.get(i-1).get(j) + pathMatrix.get(i).get(j-1));
            }
        }

        return pathMatrix.get(a-1).get(b-1);
    }
}
