package com.barrylanceleo.math;

public class ReverseInteger {
    public static int reverse(int a) {
        int sign = 1;
        if(a < 0) {
            sign *= -1;
            a *= -1;
        }

        int output = 0;
        while(a > 0) {
            // check for overflow
            if(output > (Integer.MAX_VALUE/10) - (a % 10)) {
                return 0;
            }
            output = output * 10 + a % 10;
            a /= 10;
        }
        return output * sign;
    }
}
