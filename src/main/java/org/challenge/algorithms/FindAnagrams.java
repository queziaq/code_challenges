package org.challenge.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> output = new ArrayList();
        int panLength = p.length();
        for(int i=0; i<=s.length() - panLength; i++) {
            String sub = s.substring(i, i + panLength);
            Boolean pangram  = true;

            StringBuilder tempStr = new StringBuilder(sub);

            for(int j = 0; j < panLength; j++) {
                if(!sub.contains(p.substring(j, j + 1))) {
                    pangram = false;
                    break;
                }
            }
            if(pangram) {
                output.add(i);
            }
        }
        return output;
    }
}
