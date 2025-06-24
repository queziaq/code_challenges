package org.challenge.algorithms;

public class Factorial {
    public static int factorial(int n) {
        int sum = n;
        for(int i=(n - 1); i>1; i--) {
            sum = sum * i;
        }
        return sum;
    }

    public static int factorialWhile(int n) {
        int count = n - 1;
        int sum = n;
        while(count > 1) {
            sum = sum * count;
            count--;
        }
        return sum;
    }

    public static int factorialRecursive(int n) {
        int sum = n;
        if(n == 1) {
            return sum;
        } else {
            return  sum * factorialRecursive(n - 1);
        }
    }
}
