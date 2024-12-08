package org.challenge.algorithms;

import java.util.ArrayList;
import java.util.List;

public class TwoArraysComparison {
    // having two integers with same size, you should compare both of them
    // if a greater than b, then alice scores a point
    // if a less than b, then bob scores a point
    // if a and b are equals, then no one scores anything
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer alicePoints = 0;
        Integer bobPoints = 0;
        List<Integer> scores = new ArrayList<>();

        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                alicePoints += 1 ;
            }

            if(a.get(i) < b.get(i)) {
                bobPoints += 1;
            }
        }

        scores.add(alicePoints);
        scores.add(bobPoints);

        return scores;

        //Lambda Expression
        /*int ap = (int) IntStream.range(0, a.size())
            .filter(i -> a.get(i) > b.get(i))
            .count();

        int bp = (int) IntStream.range(0, a.size())
            .filter(i -> a.get(i) < b.get(i))
            .count();

        return List.of(ap, bp); */
    }
}
