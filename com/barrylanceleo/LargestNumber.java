package com.barrylanceleo;

import java.util.*;

public class LargestNumber  {
    public static class alphaComparator implements Comparator<Integer> {

        public int compare(Integer A, Integer B) {
            if(A.equals(B)) {
                return 0;
            }
            int divisorA = 1;
            int divisorB = 1;
            int tempA = A;
            int tempB = B;
            while (tempA / 10 > 0) {
                divisorA *= 10;
                tempA /= 10;
            }
            while (tempB / 10 > 0) {
                divisorB *= 10;
                tempB /= 10;
            }

            tempA = A;
            tempB = B;
            int tempDivisorA = divisorA;
            int tempDivisorB = divisorB;

            while (tempDivisorA != 0 || tempDivisorB != 0) {
                if (tempDivisorA == 0) {
                    tempA = A;
                    tempDivisorA = divisorA;
                } else if (tempDivisorB == 0) {
                    tempB = B;
                    tempDivisorB = divisorB;
                }

                int firstDigitA = tempA / tempDivisorA;
                int firstDigitB = tempB / tempDivisorB;
                if (firstDigitA > firstDigitB) {
                    return -1;
                } else if (firstDigitA < firstDigitB) {
                    return 1;
                } else {
                    tempA %= tempDivisorA;
                    tempDivisorA /= 10;
                    tempB %= tempDivisorB;
                    tempDivisorB /= 10;
                }
            }
            return 0;
        }
    }

    // DO NOT MODIFY THE LIST
    public static String largestNumber(final List<Integer> a) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            numList.add(a.get(i));
        }
        // sort it descending
        Collections.sort(numList, new alphaComparator());

        // build the result string
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < numList.size(); i++) {
            resultBuilder.append(numList.get(i));
        }
        // remove the initial zeroes
        while(resultBuilder.length() > 1 && resultBuilder.charAt(0) == '0') {
            resultBuilder.deleteCharAt(0);
        }
        return resultBuilder.toString();
    }
}

