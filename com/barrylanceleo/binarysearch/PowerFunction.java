package com.barrylanceleo.binarysearch;

public class PowerFunction {
    private static long binaryPow(int x, int n, int d) {
        if(n == 0) {
            return 1%d;
        }
        if(n == 1) {
            return x%d;
        }
        long root = binaryPow(x, n/2, d);
        if (n%2 == 0) {
            return ((root%d) * (root%d))%d;
        }
        else {
            return (((root%d) * (root%d))%d * (x%d))%d;
        }
    }
    public static int pow(int x, int n, int d) {
        int result = (int)binaryPow(x, n, d);
        if(result < 0) {
            return d+result;
        }
        else {
            return result;
        }
    }

}
