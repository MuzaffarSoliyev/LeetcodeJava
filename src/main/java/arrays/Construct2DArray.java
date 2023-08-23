package arrays;

public class Construct2DArray {
  public int[][] construct2DArray(int[] original, int m, int n) {
    int index = 0;
    if (original.length != m * n)
      return new int[][]{};
    int[][] array2D = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        array2D[i][j] = original[index];
        index++;
      }
    }
    return array2D;
  }
}
