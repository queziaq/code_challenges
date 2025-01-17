package org.challenge.onemonthprep;

import java.util.List;

public class MiniMaxSum {
    /* Given five positive integers, find the minimum and maximum values that can be
    calculated by summing exactly four of the five integers.
    Then print the respective minimum and maximum values
    as a single line of two space-separated long integers. */
    public static void miniMaxSum(List<Integer> arr) {
        Long maxVal = Long.MIN_VALUE;
        Long minVal = Long.MAX_VALUE;
        Long sum = 0L;
        Long maxSum = 0L;
        Long minSum = 0L;

        for(Integer num: arr) {
            sum = sum + num;

            if(num > maxVal) {
                maxVal = num.longValue();
            }

            if(num < minVal) {
                minVal = num.longValue();
            }
        }

        minSum = sum - maxVal;
        maxSum = sum - minVal;

        System.out.print(minSum + " " + maxSum);
    }
}
