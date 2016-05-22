package com.barrylanceleo;

import com.barrylanceleo.arrays.FindDuplicateInArray;
import com.barrylanceleo.arrays.MergeOverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<MergeOverlappingIntervals.Interval> input = new ArrayList<>();
        input.add(new MergeOverlappingIntervals.Interval(3, 5));
        input.add(new MergeOverlappingIntervals.Interval(2, 6));
        input.add(new MergeOverlappingIntervals.Interval(9, 10));
        input.add(new MergeOverlappingIntervals.Interval(1, 2));
        System.out.println(MergeOverlappingIntervals.merge(input));
    }
}
