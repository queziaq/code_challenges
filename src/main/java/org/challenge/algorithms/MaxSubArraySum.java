package org.challenge.algorithms;

import java.util.List;

public class MaxSubArraySum {
    public static void maxSubArraySum(List<Integer> arr) {
        Long maxValue = Long.MIN_VALUE;
        Long minValue = Long.MAX_VALUE;

        for(int i=0; i<arr.size(); i++) {
            Long sum = 0L;
            for(int j=i; j<arr.size(); j++) {
                sum = sum + arr.get(j).longValue();

                if(sum > maxValue) {
                    maxValue = sum;
                }

                if(sum < minValue) {
                    minValue = sum;
                }
            }
        }

        System.out.println(maxValue + " " + minValue);
    }
}
