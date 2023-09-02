package org.testautomation.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BasicTest {
    @Test
    void testDemo() {
        assertThat("landscape")
                .containsIgnoringCase("landscape");
    }
}
