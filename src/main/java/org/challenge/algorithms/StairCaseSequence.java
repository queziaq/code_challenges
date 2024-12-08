package org.challenge.algorithms;

public class StairCaseSequence {
   /* Its base and height are both equal to n . It is drawn using # symbols and spaces.
    The last line is not preceded by any spaces.
    Write a program that prints a staircase of size n .
    Complete the staircase function in the editor below.
    staircase has the following parameter(s):
    int n: an integer */
    public static void staircase(int n) {
        String stair = new String(new char[n]).replace("\0", "#");
        String whiteSpace = new String(new char[n]).replace("\0", " ");

        // Write your code here

        for(int i=1; i<n+1 ; i++) {
            System.out.println(whiteSpace.substring(0, n - i) + stair.substring(0, i));
            // System.out.println("\n");
        }

        /*for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print '#' symbols
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            // Move to the next line
            System.out.println();
        } */
    }
}
