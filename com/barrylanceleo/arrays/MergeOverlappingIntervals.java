package com.barrylanceleo.arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervals {

    public static class Interval {
        int start;
        int end;
        public Interval() { start = 0; end = 0; }
        public Interval(int s, int e) { start = s; end = e; }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    private static class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval A, Interval B) {
            return Integer.compare(A.start, B.start);
        }
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // sort based on the starting time
        Collections.sort(intervals, new IntervalComparator());

        // merge the inervals
        int i = 1;
        while (i < intervals.size()) {
            Interval prevInterval = intervals.get(i - 1);
            if (prevInterval.end >= intervals.get(i).start) {
                // merge
                prevInterval.end = Math.max(prevInterval.end, intervals.get(i).end);
                // remove the merged interval
                intervals.remove(i);
            } else {
                i++;
            }
        }
        return intervals;
    }
}
