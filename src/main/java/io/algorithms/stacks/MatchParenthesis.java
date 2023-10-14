package io.algorithms.stacks;

import lib.dsa.stack.LinkedListStack;
import lib.dsa.stack.Stack;
import lib.dsa.stack.StackUnderflowException;

/***
 *  Match Parenthesis in an Expression
 */
public class MatchParenthesis {
    public static void main(String[] args) {
        String matchedExp = "(5 + (2 * 3) * (5 * (3 + 5) + 7) % 2)";
        char[] brackets = { '(', ')' };
        System.out.println(isMatched(matchedExp, brackets));
        String unmatched = "2 * (1 + 4) + (3 + (2 * 5) / (9 - 1) + (6 * (3 * 10) + 4)";
        System.out.println(isMatched(unmatched, brackets));
        String none = "2 + 4";
        System.out.println(isMatched(none, brackets));
        String empty = "";
        System.out.println(isMatched(empty, brackets));
        String onlyOpen = "(";
        System.out.println(isMatched(onlyOpen, brackets));
        String onlyClosed = ")";
        System.out.println(isMatched(onlyClosed, brackets));
    }

    /**
     * O(n)
     * @param expression - the expression to be evaluated as a String
     * @return true if the parenthesis match
     */
    static boolean isMatched(String expression, char[] brackets) {
        Stack<Character> stack = new LinkedListStack<>();
        for (int i = 0; i < expression.length(); i++) {
            char nextChar = expression.charAt(i);
            if (nextChar == brackets[0]) {
                stack.push(nextChar);
            } else if (nextChar == brackets[1]) {
                try {
                    stack.pop();
                } catch (StackUnderflowException e) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}