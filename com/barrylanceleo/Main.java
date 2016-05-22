package com.barrylanceleo;

import com.barrylanceleo.arrays.Flip;
import com.barrylanceleo.arrays.NBy3RepeatNumber;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 4, 1, 1, 4, 6, 7, 4, 8, 4);
        System.out.println(NBy3RepeatNumber.repeatedNumber(input));
    }
}
