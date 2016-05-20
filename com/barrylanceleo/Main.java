package com.barrylanceleo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        X.add(-100);
        X.add(60);
        Y.add(20);
        Y.add(40);
	    System.out.println(MinStepsInInfiniteGrid.coverPoints(X, Y));
    }
}
