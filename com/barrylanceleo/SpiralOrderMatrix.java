package com.barrylanceleo;
import java.util.ArrayList;
import java.util.List;
public class SpiralOrderMatrix {

    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(a.size() == 0){
            return result;
        }
        int minDimen = Math.min(a.size(), a.get(0).size());
        int numberIter = minDimen%2 ==  0? minDimen/2:(minDimen/2)+1;
        for(int k = 0; k < numberIter; k++) {
            int startX = k, endX = a.get(k).size() - 1 -k;
            int startY = k, endY = a.size() -1 - k;
            int i, j;
            for(i = startY, j = startX; j <= endX; j++) {
                result.add(a.get(i).get(j));
            }
            for(i = startY + 1, j = endX; i <= endY; i++) {
                result.add(a.get(i).get(j));
            }
            if(startY != endY) {
                for(i = endY, j = endX - 1; j >= startX; j--) {
                    result.add(a.get(i).get(j));
                }
            }
            if(startX != endX) {
                for(i = endY - 1, j = startX; i > startY; i--) {
                    result.add(a.get(i).get(j));
                }
            }
        }
        return result;
    }
}
