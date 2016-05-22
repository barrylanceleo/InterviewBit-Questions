package com.barrylanceleo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(1);
        input.add(1);
        input.add(1);
        input.add(1);

        System.out.println(FirstMissingInteger.firstMissingPositive(input));
    }
}
