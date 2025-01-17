package org.challenge.onemonthprep;

import java.util.List;

public class NumberOfCombinations {
    /*Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
    Lily decides to share a contiguous segment of the bar selected such that:
    The length of the segment matches Ron's birth month, and,
    The sum of the integers on the squares is equal to his birth day.
    Determine how many ways she can divide the chocolate.
    divide array in m(variable) parts and sum to see if it is equals to d(variable) if so then sum the combination*/
    public static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int combinations = 0;

        for(int i=0; i<=s.size() - m; i++) {
            for(int j=i; j<i + m; j++) {
                sum = sum + s.get(j);
            }
            if(sum == d) {
                combinations++;
            }
            sum = 0;
        }
        return combinations;
    }
}
