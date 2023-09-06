# Student Records Example
An Array example problem. We have a class of 30 students, and we want to store their grades for each of their six courses.
Each element of the first column will hold a reference to an array containing the grades. 30 rows and 6 columns. 
We can then calculate the student's percentage, class average, and student's position.

```
public class StudentRecords {
    public static final int NUMBER_OF_STUDENTS = 30;
    public static final int NUMBER_OF_CLASSES = 6;

  public static void main(String[] args) {
    int[][] grades = new int[NUMBER_OF_STUDENTS][NUMBER_OF_CLASSES];
    
    grades[0] = new int[]{ 99, 100, 95, 91, 88, 55 };
    grades[1] = new int[]{ 85, 89, 82, 79, 71, 91 };
    grades[2] = new int[]{ 77, 76, 71, 66, 80, 99 };
    
    for (int student = 0; student < grades.length; student++) {
      for (int grade = 0; grade < grades[i].lenght; grade++) {
        System.out.println(grades[student][grade]);
      }
    }
  }
}
```
