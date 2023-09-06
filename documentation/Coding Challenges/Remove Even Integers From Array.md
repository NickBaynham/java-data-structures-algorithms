# Remove even integers from an Array
```
public class RemoveEven {
  public stastic void main(String[] args) {
  
    // Initialization
    
    int[] someInts = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] expected = { 1, 3, 5, 7, 9 };
    
    int numberOfDeletions = 0;
    
    // Mark Even Integers
    
    for (int i = 0; i < someInts.length; i++) {
      if (someInts[i] % 2 == 0) {
        someInts[i] = -1;
        numberOfDeletions++;
      }
    }
    
    // Create the Resulting Array
    
    int[] result = new int[someInts.lengh - numberOfDeletions];
    int counter = 0;
    for (int i = 0; i < someInts.length; i++) {
      if (someInts[i] != -1) {
        result[counter++] = someInts[i];
      }
    }
    
    // Display the results
    
    for (int i : result) {
      System.out.println(i);
    }  
  }
}
```