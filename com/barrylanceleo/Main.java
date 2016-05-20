package com.barrylanceleo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
	    System.out.println(MaxSumContiguousSubarray.maxSubArray(input));
    }
}
