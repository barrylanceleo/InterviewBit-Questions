package com.barrylanceleo.arrays;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long maxArraySum = -1;
        int maxArrayStart = -1;
        int maxArrayEnd = -1;
        for (int i = 0; i < a.size(); i++) {
            long currentArraySum = 0;
            int currentArrayStart = i;
            int currentArrayEnd = i;
            while (i < a.size() && a.get(i) >= 0) {
                currentArraySum += a.get(i);
                i++;
                currentArrayEnd++;
            }
            if (currentArraySum > maxArraySum) {
                maxArraySum = currentArraySum;
                maxArrayStart = currentArrayStart;
                maxArrayEnd = currentArrayEnd;
            } else if (currentArraySum == maxArraySum &&
                    (currentArrayEnd - currentArrayStart) > (maxArrayEnd - maxArrayStart)) {
                maxArraySum = currentArraySum;
                maxArrayStart = currentArrayStart;
                maxArrayEnd = currentArrayEnd;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = maxArrayStart; i < maxArrayEnd && i < a.size(); i++) {
            result.add(a.get(i));
        }
        return result;
    }
}
