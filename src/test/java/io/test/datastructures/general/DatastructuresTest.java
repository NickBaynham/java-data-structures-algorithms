package io.test.datastructures.general;

import io.datastructures.general.Bag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DatastructuresTest {
    @Test void testBagStats() {
        Bag<Double> numbers = new Bag<>();
        double[] numberList = { 3, 44.4, 21.1, 34.65, 2.1, 5.6, 0.0 };
        for (double d : numberList) {
            numbers.add(d);
        }
        assertThat(numberList.length).isEqualTo(numbers.size());

        int n = numbers.size();
        double sum = 0.0;
        for (double d : numbers) {
            sum += d;
        }

        double mean = sum / n;
        System.out.println("Mean is: " + mean);
    }
}
