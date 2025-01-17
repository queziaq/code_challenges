package org.challenge.onemonthprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median {
    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
      https://en.wikipedia.org/wiki/Median */

    public static int findMedian(List<Integer> arr) {
        List<Integer> mutableArr = new ArrayList(arr);
        Integer median;
        Collections.sort(mutableArr);
        if(mutableArr.size() % 2 == 0) {
            int indexA = mutableArr.size() / 2;
            int indexB = indexA + 1;

            median = (mutableArr.get(indexA) + mutableArr.get(indexB)) / 2;
        } else {
            int indexA = (mutableArr.size()) / 2;
            median = mutableArr.get(indexA);
        }

        return median;

    }
}
