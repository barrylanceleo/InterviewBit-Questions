package com.barrylanceleo.backtracking;

import java.util.ArrayList;
public class Permutations {

    private static int size ;

    private static void permuteHelper(ArrayList<Integer> input, ArrayList<ArrayList<Integer>> result,
                                      int index, ArrayList<Integer> current) {

        if(index == size) {
            result.add(new ArrayList<Integer> (current));
            return;
        }


        for(int i = 0; i < input.size(); i++) {
            int currentInt = input.get(i);
            current.add(currentInt);
            input.remove(i);

            permuteHelper(input, result, index+1, current);
            current.remove(current.size()-1);
            input.add(i, currentInt);
        }

    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        size = a.size();

        permuteHelper(a, result, 0, new ArrayList<Integer>());

        return result;

    }
}
