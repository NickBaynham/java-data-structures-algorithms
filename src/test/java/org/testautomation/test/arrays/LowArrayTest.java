package org.testautomation.test.arrays;

import org.junit.jupiter.api.Test;
import org.testautomation.arrays.LowArray;
import static org.assertj.core.api.Assertions.assertThat;

public class LowArrayTest {
    @Test
    void testLowArray() {
        LowArray lowArray = new LowArray(10);
        lowArray.setElement(0, 42);
        long result = lowArray.getElement(0);
        assertThat(result).isEqualTo(42);
    }
}
