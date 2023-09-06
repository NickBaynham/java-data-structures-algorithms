# Find two numbers that add up to n
```
public class FindTwo {
  public static void main(String[] args) {
    FindTwo findTwo = new FindTwo();
    display(findTwo);  
    
  }
  
  int[] findSum(int[] arr, int n) {
    result = null;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == n) {
            result =  new int[] { arr[i], arr[j] };
            break;
      }
      return result;
  }
  
  void display(int[] array) {
    for (int i : array) {
      System.out.print(i + "\t");
    }
    System.out.println();
  }
}
```