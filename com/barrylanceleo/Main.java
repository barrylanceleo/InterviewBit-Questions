package com.barrylanceleo;

import com.barrylanceleo.arrays.Flip;
import com.barrylanceleo.arrays.NBy3RepeatNumber;
import com.barrylanceleo.binarysearch.MatrixSearch;
import com.barrylanceleo.binarysearch.SearchForARange;
import com.barrylanceleo.binarysearch.SquareRootOfInteger;
import com.barrylanceleo.math.ExcelColumnTitle;
import com.barrylanceleo.math.GridUniquePaths;
import com.barrylanceleo.math.SortedPermutationRank;
import com.barrylanceleo.math.SortedPermutationRankWithRepeats;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);

        System.out.println(SearchForARange.searchRange(input, 10));
    }
}
