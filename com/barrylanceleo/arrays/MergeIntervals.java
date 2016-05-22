package com.barrylanceleo.arrays;

import java.util.ArrayList;

public class MergeIntervals {
    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        // add all intervals before the new interval
        int i = 0;
        while(i < intervals.size() && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i));
            i++;
        }

        // merge the new interval with the current interval
        if(i < intervals.size()) {
            if(newInterval.end  < intervals.get(i).start) {
                result.add(newInterval);
            }
            else  {
                result.add(new Interval(Math.min(intervals.get(i).start, newInterval.start),
                        Math.max(intervals.get(i).end, newInterval.end)));
                i++;
            }
        }
        else {
            result.add(newInterval);
        }

        // add the remaining intervals merging with the previous if necw
        while(i < intervals.size()) {
            // check overlap
            Interval prevInterval = result.get(result.size()-1);
            Interval currInterval = intervals.get(i);
            if(prevInterval.end >= currInterval.start) {
                // merge with previous
                result.set(result.size()-1, new Interval(prevInterval.start, Math.max(prevInterval.end, currInterval.end)));
            }
            else {
                result.add(currInterval);
            }
            i++;
        }
        return result;
    }
}
