package com.excercise.coding;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Pow XN Binary Exponentiation Test")
public class PowXNBinaryExponentiationTest {

    private PowXNBinaryExponentiation powXNBinaryExponentiation;
    double[] inputX = {2.0, 2.10000, 2.00000, 2.00000};
    int[] inputN = {10, 3, -2, -2147483648};
    double[] outputExpected = {1024.00000, 9.26100, 0.25000, 0.00000};
    double delta = 1e-5;

    @BeforeEach
    void setUp() {
        powXNBinaryExponentiation = new PowXNBinaryExponentiation();
    }

    @Test
    @DisplayName("Should get the X")
    void testMyPow() {
        double[] result = new double[outputExpected.length];
        for (int i = 0; i < inputN.length; i++) {
            result[i] = powXNBinaryExponentiation.myPow(inputX[i], inputN[i]);
        }
        assertArrayEquals(outputExpected, result, delta);

    }

}
