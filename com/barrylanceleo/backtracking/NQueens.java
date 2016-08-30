package com.barrylanceleo.backtracking;

import java.util.ArrayList;

/**
 * Created by barry on 6/26/16.
 */
public class NQueens {
    private static class Pair {
        int first;
        int second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private static void NQueensHelper(ArrayList<ArrayList<String>> output, int input,
                               ArrayList<Pair> currentPositions, int index) {

        if(index == input) {
            // add to output
            ArrayList<String> currentOutput = new ArrayList<>();
            for(int i = 0; i < currentPositions.size(); i++) {
                StringBuilder sb= new StringBuilder();
                for(int j = 0 ; j < input; j++) {
                    if(j == currentPositions.get(i).first) {
                        sb.append('Q');
                    }
                    else {
                        sb.append('.');
                    }
                }
                currentOutput.add(sb.toString());
            }
            output.add(currentOutput);
            return;
        }

        for(int i = 0; i < input; i++) {
            int j;
            for(j = 0; j < currentPositions.size(); j++) {
                Pair thisPosition = currentPositions.get(j);
                if(thisPosition.first == i ||
                        Math.abs(thisPosition.first - i) == Math.abs(thisPosition.second - index)) {
                    break;
                }
            }
            if(j == currentPositions.size()) {
                currentPositions.add(new Pair(i, index));
                NQueensHelper(output, input, currentPositions, index+1);
                currentPositions.remove(currentPositions.size()-1);
            }
        }
    }


    public static ArrayList<ArrayList<String>> solveNQueens(int a) {

        ArrayList<ArrayList<String>> output = new ArrayList<>();
        NQueensHelper(output, a, new ArrayList<Pair> (), 0);

        return output;

    }
}
