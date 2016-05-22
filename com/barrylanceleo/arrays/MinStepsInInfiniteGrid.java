package com.barrylanceleo.arrays;

import java.util.ArrayList;


public class MinStepsInInfiniteGrid {
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        if(X.size() != Y.size()) {
            return 0;
        }

        int distance = 0;
        for(int i = 1; i < X.size(); i++) {
            int currentX = X.get(i-1);
            int currentY = Y.get(i-1);
            while(currentX != X.get(i) || currentY != Y.get(i)) {
                if(X.get(i) > currentX) {
                    currentX += 1;
                }
                else if(X.get(i) < currentX) {
                    currentX -= 1;
                }

                if(Y.get(i) > currentY) {
                    currentY += 1;
                }
                else if(Y.get(i) < currentY) {
                    currentY -= 1;
                }
                distance++;
            }
        }
        return distance;
    }
}
