## Arrays

### Initialization
```java
class ArrayExamples {
    public static void main(String[] args) {
        // --- Declaration of Arrays
        
        int[] array1;
        
        // -- Array Initialization
        
        array1 = new int[10];
        
        // -- Accessing Elements in the Array
        
        for (int i : array1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < array1.length; i++) {
            System.out.println(a[i]);
        }
        
        // -- Declare in one step
        
        int[] iArray = new int[10];
        for (i = 0; i < iArray.length; i++) {
            System.out.println(iArray[i]);
        }
    }
}
```

### Array Element Assignment
```
public class ArrayAssigment {
  public static void main(String[] args) {
  
    // Declaration and Initialization
    int[] anArray = new int[5];
    
    // Assignment
    anArray[0] = 25;
    anArray[1] = 31;
    anArray[2] = 42;
    anArray[3] = 77;
    
    for (int i = 0; i < anArray.length; i++) {
      System.out.println("Element: " + i + " has value: " + anArray[i];
    }  
  }
}
```

### Using an Array Literal
```
public class ArrayLiterals {
  public static void main(String[] args) {
    // Declare, initialize, and assign values
    int[] array = {10, 26, 42, 99}
    
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
```