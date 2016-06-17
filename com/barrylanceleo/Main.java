package com.barrylanceleo;

import com.barrylanceleo.strings.CompareVersionNumbers;
import com.barrylanceleo.strings.LongestCommonPrefix;
import com.barrylanceleo.strings.StrStr;
import com.barrylanceleo.strings.ZigzagString;
import com.barrylanceleo.twoPointers.RemoveDuplicatesFromSortedArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>();
        input.add(5000);
        input.add(5000);
        input.add(5000);

        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(input));
    }
}
