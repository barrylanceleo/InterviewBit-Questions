package com.barrylanceleo.arrays;

import java.util.ArrayList;
import java.util.List;

public class NBy3RepeatNumber {
    public static class Pair {
        int num;
        int count;
        public Pair(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
    // DO NOT MODIFY THE LIST
    public static int repeatedNumber(final List<Integer> a) {
        ArrayList<Pair> numStore = new ArrayList<>();
        for(int i = 0; i < a.size(); i++) {
            // if number in store increment count
            int j = 0;
            for(; j < numStore.size(); j++) {
                if(numStore.get(j).num == a.get(i)) {
                    numStore.get(j).count++;
                    break;
                }
            }
            // if number not found
            if(j == numStore.size()) {
                // check if there is space to add the number
                if(numStore.size() != 2) {
                    numStore.add(new Pair(a.get(i), 1));
                }
                else {
                    int k = 0;
                    while(k < numStore.size()) {
                        numStore.get(k).count--;
                        // if count is zero remove it from the store
                        if(numStore.get(k).count == 0) {
                            numStore.remove(k);
                        }
                        else {
                            k++;
                        }
                    }
                }
            }
        }

        // check if the number is the store are present N/3 times
        for(int i = 0; i < numStore.size(); i++) {
            int count = 0;
            for(int j = 0; j < a.size(); j++) {
                if(a.get(j) == numStore.get(i).num) {
                    count++;
                }
            }
            if(count > a.size()/3) {
                return numStore.get(i).num;
            }
        }
        return -1;
    }
}
