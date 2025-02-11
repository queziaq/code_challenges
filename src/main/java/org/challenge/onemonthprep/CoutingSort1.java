package org.challenge.onemonthprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoutingSort1 {
    //count how many times a number appers in an array/list
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> nums = new ArrayList<>(Collections.nCopies(100, 0));

        for (int num : arr) {
            nums.set(num, nums.get(num) + 1);
        }

        return nums;
    }
}
