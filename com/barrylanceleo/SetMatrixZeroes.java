package com.barrylanceleo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by barry on 5/21/16.
 */
public class SetMatrixZeroes {

    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroColumns = new HashSet<>();

        // find the zero rows and columns
        for(int row = 0; row < a.size(); row++) {
            for(int col = 0; col < a.get(row).size(); col++) {
                if(a.get(row).get(col) == 0) {
                    zeroRows.add(row);
                    zeroColumns.add(col);
                }
            }
        }

        // update the rows
        Iterator<Integer> rowIterator = zeroRows.iterator();
        while(rowIterator.hasNext()) {
            int currentRow = rowIterator.next();
            for(int col = 0; col < a.get(currentRow).size(); col++) {
                a.get(currentRow).set(col, 0);
            }
        }

        // update the columns
        Iterator<Integer> colIterator = zeroColumns.iterator();
        while (colIterator.hasNext()) {
            int currentCol = colIterator.next();
            for(int row = 0; row < a.size(); row++) {
                a.get(row).set(currentCol, 0);
            }
        }
    }
}
