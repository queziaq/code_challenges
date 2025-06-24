package org.challenge;

import org.challenge.algorithms.Factorial;
import org.challenge.onemonthprep.OneMonthPreparationPrincipal;
import org.challenge.topalgorithms.TopAlgorithms;

import static org.challenge.algorithms.Factorial.factorialRecursive;
import static org.challenge.algorithms.Factorial.factorialWhile;

public class Main {
    public static void main(String[] args) {
       //System.out.println( Factorial.factorial(6));
        //OneMonthPreparationPrincipal.execute();
        //System.out.println(factorialRecursive(5));
        //int[] arr = {4, 16, -1, 37};
        //System.out.println(TopAlgorithms.largestSumV2(arr));

        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(TopAlgorithms.findTheMissingNumber(arr));
    }
}