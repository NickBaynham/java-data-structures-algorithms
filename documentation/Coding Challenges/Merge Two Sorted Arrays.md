# Merge Two Sorted Arrays
Given two sorted array, merge them into one array, which should also be sorted. 

```
public class MergeSorted {
  public static void main(String[] args) {
    int[] array1 = {1, 3, 4, 5}
    int[] array2 = {2, 6, 7, 8}
    MergeSorted mergeSorted = new MergeSorted();
    mergeSorted.display(mergesorted.mergeArrays(array1, array2);
  }
  
  int[] mergeArrays(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    int arr1Counter = 0, arr2Counter = 0;
    for (int i = 0; i < result.length; i++) {
      if (arr1[arr1Counter] > arr2[arr2Counter]) {
        result[i] = arr1[arr1Counter++];
      } else {
        result[i] = arr2[arr2Counter++];
      }
    }
    return arr2;
  }
  
  void display(int[] array) {
    for (int i : array) {
      System.out.print(i + "\t");
    }
    System.out.println();
  }
}
```