package com.barrylanceleo.backtracking;

import java.util.ArrayList;

public class GrayCode {

    private static void grayCodeHelper(ArrayList<StringBuilder> outputBuilder, int input, int index) {
        if(input == index) {
            return;
        }

        for(int i = 0; i < outputBuilder.size(); i++) {
            outputBuilder.set(i, outputBuilder.get(i).insert(0, '0'));
        }

        for(int i = outputBuilder.size()-1; i > -1; i--) {
            outputBuilder.add(new StringBuilder(outputBuilder.get(i)).replace(0, 1, "1"));
        }

        grayCodeHelper(outputBuilder, input, index+1);

    }

    public static ArrayList<Integer> grayCode(int a) {

        ArrayList<StringBuilder> outputBuilder = new ArrayList<>();
        outputBuilder.add(new StringBuilder());

        grayCodeHelper(outputBuilder, a, 0);

        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 0; i < outputBuilder.size(); i++) {
            output.add(Integer.parseInt(outputBuilder.get(i).toString(), 2));
        }
        return output;
    }


}
