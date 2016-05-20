package com.barrylanceleo;

import java.util.List;

public class MaxSumContiguousSubarray {
    public static int maxSubArray(final List<Integer> a) {
        if(a.size() == 0) {
            return 0;
        }
        int maxSum = a.get(0);
        int currentSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum += a.get(i);
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
