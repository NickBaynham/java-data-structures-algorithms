package test.lib.dsa.problems;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

public class TwoSum {
    // this should be its own class, but for the sake of simplicity, I'm including it here
    // this is the brute-force solution, which has a time complexity of O(n^2) and space complexity of O(1)
    // private int[] twoSumBf(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[] { i, j };
    //             }
    //         }
    //     }
    //     return new int[] {}; // since the problem guarantees exactly one solution, 
    //                          // this line should never be reached    
    // }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // since the problem guarantees exactly one solution, 
                             // this line should never be reached    
    }


    @Test
    void testTwoSum() {
        int[] data = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };

        int[] result = twoSum(data, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testTwoSumExample2() {
        int[] data = { 3, 2, 4 };
        int target = 6;
        int[] expected = { 1, 2 };

        int[] result = twoSum(data, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testTwoSumExample3() {
        int[] data = { 3, 3 };
        int target = 6;
        int[] expected = { 0, 1 };

        int[] result = twoSum(data, target);
        assertThat(result).isEqualTo(expected);
    }
}