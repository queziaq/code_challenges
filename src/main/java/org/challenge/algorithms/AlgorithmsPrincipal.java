package org.challenge.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.challenge.algorithms.ArraySum.simpleArraySum;
import static org.challenge.algorithms.MatrixDiagonalsSum.diagonalDifference;
import static org.challenge.algorithms.StairCaseSequence.staircase;
import static org.challenge.algorithms.TwoArraysComparison.compareTriplets;

public class AlgorithmsPrincipal {
    public static void execute() {
        // 1. Simple Array Sum
        System.out.println(simpleArraySum(List.of(1,2,8,39,29,28)));

        // 2. Compare Arrays for Alice & Bob points
        System.out.println(compareTriplets(List.of(1,2,8,39,28), List.of(5,2,8,90,14)));

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(7, 2, 3));
        matrix.add(Arrays.asList(5, 6, 7));
        matrix.add(Arrays.asList(43, 10, 11));

        // Calculate matrix diagonals difference (left & right)
        System.out.println(diagonalDifference(matrix));

        // print stair case # according to n size
        staircase(10);
    }
}
