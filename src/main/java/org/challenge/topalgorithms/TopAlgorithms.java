package org.challenge.topalgorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TopAlgorithms {

    /*
        Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.
    */
    public static int largestSum(int[] numbers) {
        Integer currentMax = numbers[0];
        Integer maxSoFar = numbers[0];

        for(int i=1; i<numbers.length; i++) {
            currentMax = Math.max(numbers[i], currentMax + numbers[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

       return maxSoFar;
    }

    public static int largestSumV2(int[] numbers) {
        Integer currentMax = numbers[0];
        Integer maxSoFar = numbers[0];
        List subList = new ArrayList<Integer>();
        subList.add(numbers[0]);

        for(int i=1; i<numbers.length; i++) {
            /*
                The beginning of the loop, verifies when index 0 + index 1 is greater than index 1 alone if so then currentMax receives
                index 0 + index 1, if not current max only receives the index 1 instead
             */
            if(currentMax + numbers[i] > numbers[i]) {
                currentMax = currentMax + numbers[i];
                subList.add(numbers[i]);
            } else {
                currentMax = numbers[i]; // Start a new subarray when continuing the old one would reduce the total and avoid negative values to drag the value down
                subList.clear();
                subList.add(numbers[i]);
            }
            /*
                Verifies if current max is greater than global max sum, if so max sum receives the current sum
             */

            if(currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }
        System.out.println("SubArraySum: " + subList);
        return maxSoFar;
    }
    /*
        Given an array arr[] of size n-1 with distinct integers in the range of [1, n].
        This array represents a permutation(ordered elements) of the integers from 1 to n with one element missing.
        Find the missing element in the array.
    */
    public static int findTheMissingNumber(int[] numbers) {
        Arrays.sort(numbers);
        //{8, 2, 4, 5, 3, 7, 1}
        //{1, 2, 3, 4, 5, 7, 8}
        // 1, 2, 3, 5
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] != i+1) { // verify if array has the next number.
               return i+1;
            }
        }

        // If all numbers are in place, missing is the last one (n)
        return numbers.length + 1;
    }
}
