package com.barrylanceleo;

import com.barrylanceleo.arrays.Flip;
import com.barrylanceleo.arrays.NBy3RepeatNumber;
import com.barrylanceleo.binarysearch.*;
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
        List<Integer> input = Arrays.asList(186, 192, 193, 202, 204, 2, 3, 6, 10, 11, 12, 17, 21, 28, 29, 30, 31, 32, 37, 38, 39, 40, 41, 47, 49, 50, 51, 52, 55, 57, 58, 59, 60, 65, 67, 68, 71, 72, 74, 77, 78, 80, 82, 83, 88, 89, 90, 94, 100, 107, 108, 109, 111, 112, 114, 115, 116, 118, 119, 121, 123, 124, 126, 129, 133, 134, 135, 137, 138, 144, 147, 148, 150, 151, 154, 156, 159, 161, 163, 165, 166, 167, 168, 169, 174, 178, 180, 182, 183, 185);
        System.out.println(RotatedSortedArraySearch.search(input, 143));
    }
}
