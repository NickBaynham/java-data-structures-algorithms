package org.testautomation.test.arrays;

import org.junit.jupiter.api.Test;
import org.testautomation.arrays.HighArray;
import static org.assertj.core.api.Assertions.assertThat;

public class HighArrayTest {
    @Test
    void testHighArray() {
        HighArray highArray = new HighArray(10);
        highArray.insert(42);
        highArray.insert(26);
        highArray.insert(33);
        boolean indexOfValue = highArray.find(33);
        if (!indexOfValue) {
            System.out.println("The Search Key of 33 was not found.");
        }
        boolean result = highArray.delete(33);
        if (result) {
            System.out.println("The item 33 was deleted.");
        } else {
            System.out.println("The item 33 was not found.");
        }
    }
}
