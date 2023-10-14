package io.algorithms.expressionevaluation;

import org.testautomation.stacks.Stack;

public class ExpressionEvaluation {
    public static void main(String[] args) {
        String expression = "(1 + (( 2 + 3 ) * ( 4 * 5 )))";
        double result = 101.0;

        Stack<Character> operators = new Stack<>(100);
        Stack<Double> operands = new Stack<>(100);

        for (int i = 0; i < expression.length(); i++) {
            System.out.println("Next symbol is [" + i + "] -> [" + expression.charAt(i) + "]");
            switch (expression.charAt(i)) {
                case ' ', '(' -> {
                    System.out.println("Blank space detected.");
                }
                case '+', '-', '*', '/' -> {
                    System.out.println("Operator added to the stack.");
                    operators.push(expression.charAt(i));
                }
                default -> {
                    System.out.println("Operand added to the stack.");
                    operands.push(Double.parseDouble(expression.charAt(i) + ""));
                }
                case ')' -> {
                    System.out.println("Closing bracket encountered.");
                    Character op = operators.pop();
                    System.out.println("The calculation is " + op);
                    double v = operands.pop();
                    switch (op) {
                        case '+' -> {
                            v = operands.pop() + v;
                            System.out.println("Result is " + v);
                            operands.push(v);
                        }
                        case '-' -> {
                            v = operands.pop() - v;
                            System.out.println("Result is " + v);
                            operands.push(v);
                        }
                        case '*' -> {
                            v = operands.pop() * v;
                            System.out.println("Result is " + v);
                            operands.push(v);
                        }
                        case '/' -> {
                            v = operands.pop() / v;
                            System.out.println("Result is " + v);
                            operands.push(v);
                        }
                    }
                }
            }
        }
        System.out.println(operands.pop());
    }
}