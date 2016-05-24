package com.barrylanceleo.math;

public class TrailingZerosInFactorial {
    public static int trailingZeroes(int a) {
        int zeroes = 0;
        int power;
        int i = 1;
        while((power = (int)Math.pow(5, i)) <= a) {
            zeroes += a/power;
            i++;
        }
        return zeroes;

        /* Another solution
        int sum = 0;
        while (n / 5 > 0) {
            sum += (n / 5);
            n /= 5;
        }
        return sum;
        */
    }
}
