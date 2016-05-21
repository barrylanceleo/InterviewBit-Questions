package com.barrylanceleo;

import java.util.ArrayList;

public class AddOneToNumber {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        if (a.size() == 0) {
            return null;
        }
        int carryover = 1;
        for (int i = a.size() - 1; i >= 0; i--) {
            int sum = (a.get(i) + carryover) % 10;
            carryover = (a.get(i) + carryover) / 10;
            a.set(i, sum);
        }

        // handle the carryover
        if (carryover != 0) {
            a.add(0, carryover);
        }

        // remove preceding zeroes, if any
        while (a.get(0) == 0) {
            a.remove(0);
        }
        return a;
    }
}
