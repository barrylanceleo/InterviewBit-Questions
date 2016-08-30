package com.barrylanceleo.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringConcatination {
    public static ArrayList<Integer> findSubstring(String a, final List<String> b) {

        ArrayList<Integer> output = new ArrayList<>();

        if(a.length() == 0 || b.size() == 0) {
            return output;
        }

        // get the size of the sub strings
        int subStringSize = b.get(0).length();


        // put the list of strings in a hashMap, pointing to the count(no. of repetitions)
        int start = 0;

        while(start <= a.length() - b.size() * subStringSize) {
            HashMap<String, Integer> stringMap = new HashMap<>();
            for(int i = 0; i < b.size(); i++) {
                if(stringMap.containsKey(b.get(i))) {
                    stringMap.put(b.get(i), stringMap.get(b.get(i)) + 1);
                }
                else {
                    stringMap.put(b.get(i), 1);
                }
            }

            // check if all the words are present from the current Start
            int i;
            for(i = 0; i < b.size() ; i++) {
                int currentStart = start + i * subStringSize;
                if(a.length() - currentStart < subStringSize)
                {
                    break;
                }
                String currentWord = a.substring(currentStart, currentStart + subStringSize);
                if(stringMap.containsKey(currentWord) && stringMap.get(currentWord) > 0) {
                    stringMap.put(currentWord, stringMap.get(currentWord) - 1);
                }
                else {
                    break;
                }
            }

            if(i == b.size()) {
                output.add(start);
            }
            start++;
        }

        return output;
    }
}
