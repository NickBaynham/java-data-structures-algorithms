package io.test.algorithms.binarytodecimal;

import io.algorithms.binarytodecimal.OctalToDecimal;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OctalToDecimalTest {
    @Test
    void test2410() {
        String octalNumber = "2410";
        long expectedResult = 1288;
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        long actualResult = octalToDecimal.octalToDecimal(octalNumber);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
