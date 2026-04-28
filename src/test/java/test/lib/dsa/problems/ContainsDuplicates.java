package test.lib.dsa.problems;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicates {
    private boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() < nums.length) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testContainsDuplicate() {
        assertThat(containsDuplicate(new int[] { 1, 2, 3, 1 })).isTrue();
    }
}
