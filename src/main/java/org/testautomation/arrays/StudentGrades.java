package org.testautomation.arrays;

public class StudentGrades {
    public static final int NUMBER_OF_STUDENTS = 30;
    public static final int NUMBER_OF_CLASSES = 6;

    private static final int[][] grades = new int[NUMBER_OF_STUDENTS][NUMBER_OF_CLASSES];
    public static void main(String[] args) {
        initializeStudentGrades();
        displayGrades();
    }

    public static void displayGrades() {
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println(grades[i][j]);
            }
        }
    }

    private static void initializeStudentGrades() {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = new int[]{ 44, 66, 72, 21, 66, 99 };
        }
    }
}
