package org.challenge.algorithms;

import java.util.List;

public class ArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here

        return ar.stream().mapToInt(i -> i).sum();

    }
}
