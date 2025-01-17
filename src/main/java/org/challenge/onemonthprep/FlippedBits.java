package org.challenge.onemonthprep;

public class FlippedBits {
    public static long flippingBits(long n) {
        // Mask to work with only the lower 32 bits (ensuring we work with 32-bit unsigned values)
        long mask = 0xFFFFFFFFL; // 32-bit mask (all bits set to 1)

        // Flip the bits by applying bitwise NOT (~) and ANDing with the mask to restrict to 32 bits
        long flipped = ~n & mask;

        // Return the flipped decimal value
        return flipped;

    }

}
