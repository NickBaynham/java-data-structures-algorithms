package test.lib.dsa.problems;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Palindrome {
    private boolean palindrome(String s) {
                
        if (s == null || s.isEmpty()) {
            return true;
        }

        // eliminate all non-alphanumeric characters and convert to lower case
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // we need to loop through the first half of the string and compare it to the second half of the string
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testPalindrome() {
        assertThat(palindrome("Am I ma")).isTrue();
        assertThat(palindrome("A man, a plan, a canal: Panama")).isTrue();
        assertThat(palindrome("A man, a plan, a rookie mistake.")).isFalse();
        assertThat(palindrome(" ")).isTrue();
        assertThat(palindrome("race a car")).isFalse();
        assertThat(palindrome("0P")).isFalse();
        assertThat(palindrome("")).isTrue();
    }
}
