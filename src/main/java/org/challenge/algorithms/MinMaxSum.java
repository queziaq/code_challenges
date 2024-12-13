package org.challenge.algorithms;

import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long minSum = Long.MAX_VALUE;
        Long maxSum = Long.MIN_VALUE;
        Long sum = 0L;

        for(int i=0; i<arr.size(); i++) {
            Long value = arr.get(i).longValue();
            sum += value;

            if(value < minSum) {
                minSum = value;
            }

            if(value > maxSum) {
                maxSum = value;
            }
        }

        Long maxValue = sum - minSum;
        Long minValue = sum - maxSum;

        System.out.println(minValue + " " + maxValue);
    }
}
