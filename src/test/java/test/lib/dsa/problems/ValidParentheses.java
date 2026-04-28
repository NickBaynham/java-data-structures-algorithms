package test.lib.dsa.problems;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Stack;

public class ValidParentheses {

    private boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> opCharacters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                opCharacters.push(c);
            } else {
                // We have a closing character, we need to check if it had a matching opening character
                if (opCharacters.isEmpty()) {
                    return false; // we have a closing character with no opening character
                } else {
                    Character opCharacter = opCharacters.pop();
                    if (
                        (c == '}' && opCharacter == '{') ||
                        (c == ']' && opCharacter == '[') ||
                        (c == ')' && opCharacter == '(')) {
                            continue;
                    } else {
                        return false;   
                    }
                }
            }
        }

        if (!opCharacters.isEmpty()) {
            return false; // we have some opening characters that were never closed
        } else {
            return true;
        }
    }

    @Test
    void testValidParentheses() {
        String data = "()";
        boolean expected = true;

        boolean result = isValid(data);
        assertThat(result).isEqualTo(expected);
        assertThat(isValid("(")).isFalse();
        assertThat(isValid("()[]{}")).isTrue();
        assertThat(isValid("(]")).isFalse();  
        assertThat(isValid("([])]]")).isFalse();
        assertThat(isValid("()[]{}")).isTrue();
        assertThat(isValid("(]")).isFalse();
        assertThat(isValid("([)]")).isFalse();
        assertThat(isValid("{[]}")).isTrue();
        assertThat(isValid(")")).isFalse();
        assertThat(isValid("((")).isFalse();
    }
}