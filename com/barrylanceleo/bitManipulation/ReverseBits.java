package com.barrylanceleo.bitManipulation;

/**
 * Created by barry on 6/17/16.
 */
public class ReverseBits {

    public static long reverse(long a) {

        final int NUM_BITS = 32;
        long reverseNum = 0;

        for(int i = 0; i < NUM_BITS; i++) {
            if((a & (1 << i)) != 0) {
                reverseNum |= ((long)1 << (NUM_BITS-1 - i));
            }
        }
        return reverseNum;
    }

}
