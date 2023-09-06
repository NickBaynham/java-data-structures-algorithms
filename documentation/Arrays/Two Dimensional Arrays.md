# Two Dimensional Arrays

## Declaration
```
public class TwoDimenional {
  public static void main(String[] args) {
    int[][] twodim = new int[5][5];
    twodim[0][0] = 42;
    
    for (int i = 0; i < twodim.length; i++) {
      for (int j = 0; j < twodim[i].length; j++) {
        System.out.println("Array at position: [" + i + "][" + j + "] has value: " + twodim[i][j]);
      }
    }
  }
}
```