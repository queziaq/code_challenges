package org.challenge.algorithms;

import java.util.List;

public class MatrixDiagonalsSum {
    //Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    //The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer leftRight = 0;
        Integer rightLeft = 0;

        for(int i=0; i < arr.size(); i++) {
            for(int j=0; j< arr.get(i).size(); j++ ) {

                if(i == j) {
                    leftRight = leftRight + arr.get(i).get(j);
                }

                if((i+j) == arr.size() - 1) {
                    rightLeft = rightLeft + arr.get(i).get(j);
                }
            }
        }

        if(leftRight < rightLeft) {
            return rightLeft - leftRight;
        }

        return (leftRight - rightLeft);
    }

    // what if I wanted to use arrays instead ???
    /*
    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
     */
}
