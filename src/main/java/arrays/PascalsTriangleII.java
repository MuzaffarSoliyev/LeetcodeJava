package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> integers = new ArrayList<>();
    for (int i = 0; i < rowIndex + 1; i++) {
      integers.add(0);
    }
    integers.set(0, 1);
    for (int i = 1; i < rowIndex + 1; i++) {
      for (int j = i; j >= 1; j--) {
        integers.set(j, integers.get(j - 1) + integers.get(j));
      }
    }
    return integers;
  }
}
