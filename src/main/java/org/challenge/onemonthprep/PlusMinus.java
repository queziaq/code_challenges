package org.challenge.onemonthprep;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        Float positive = 0f;
        Float zeroNum = 0f;
        Float negative = 0f;

        for(Integer num: arr) {
            if(num > 0) {
                positive++;
            }

            if(num < 0) {
                negative++;
            }

            if(num == 0) {
                zeroNum++;
            }
        }

        System.out.println(String.format("%.6f",(positive / arr.size())));
        System.out.println(String.format("%.6f",(negative / arr.size())));
        System.out.println(String.format("%.6f",(zeroNum / arr.size())));
    }
}
