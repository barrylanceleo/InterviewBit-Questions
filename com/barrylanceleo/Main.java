package com.barrylanceleo;

import com.barrylanceleo.arrays.Flip;
import com.barrylanceleo.arrays.NBy3RepeatNumber;
import com.barrylanceleo.binarysearch.MatrixSearch;
import com.barrylanceleo.binarysearch.SquareRootOfInteger;
import com.barrylanceleo.math.ExcelColumnTitle;
import com.barrylanceleo.math.GridUniquePaths;
import com.barrylanceleo.math.SortedPermutationRank;
import com.barrylanceleo.math.SortedPermutationRankWithRepeats;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        int n = 9, m = 8;
        for(int i = 1; i <= n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 1; j <= m; j++) {
                row.add((i*n)+j);
            }
            input.add(row);
        }
        System.out.println(MatrixSearch.searchMatrix(input, 40));
    }
}
