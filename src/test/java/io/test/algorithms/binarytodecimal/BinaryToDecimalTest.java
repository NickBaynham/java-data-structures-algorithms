package io.test.algorithms.binarytodecimal;

import io.algorithms.binarytodecimal.BinaryToDecimal;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryToDecimalTest {
    @Test
    void testDemo() {
        assertThat("landscape")
                .containsIgnoringCase("land");
    }

    @Test
    void testWithValidInput() {
        String binaryNumber = "1010101";
        int expectedResult = 85;
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        int actualResult = binaryToDecimal.binaryToDecimal(binaryNumber);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testNull() {
        String binaryNumber = null;
        int expectedResult = 0;
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        try {
            int actualResult = binaryToDecimal.binaryToDecimal(binaryNumber);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(NullPointerException.class);
        }
    }

    @Test
    void testEmpty() {
        String binaryNumber = "";
        int expectedResult = 0;
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        int actualResult = binaryToDecimal.binaryToDecimal(binaryNumber);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testZero() {
        String binaryNumber = "0";
        int expectedResult = 0;
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        int actualResult = binaryToDecimal.binaryToDecimal(binaryNumber);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void test48() {
        String binaryNumber = "110000";
        int expectedResult = 48;
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        int actualResult = binaryToDecimal.binaryToDecimal(binaryNumber);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testInvalidInput() {
        String binaryNumber = "110000G";
        int expectedResult = 96;
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        int actualResult = binaryToDecimal.binaryToDecimal(binaryNumber);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}