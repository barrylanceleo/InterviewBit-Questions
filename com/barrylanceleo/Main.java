package com.barrylanceleo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(i);
            row.add(i+1);
            input.add(row);
        }
	    System.out.println(SpiralOrderMatrix.spiralOrder(input));
    }
}
