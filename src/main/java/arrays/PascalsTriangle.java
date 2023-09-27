package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> lists = new ArrayList<>();
    if (numRows > 0) {
      lists.add(new ArrayList<>() {{
        add(1);
      }});
    }
    if (numRows > 1) {
      lists.add(new ArrayList<>() {{
        add(1);
        add(1);
      }});
    }
    if (numRows > 2) {
      for (int i = 2; i < numRows; i++) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        for (int j = 0; j < lists.get(i - 1).size() - 1; j++) {
          tmp.add(lists.get(i - 1).get(j) + lists.get(i - 1).get(j + 1));
        }
        tmp.add(1);
        lists.add(tmp);
      }
    }
    return lists;
  }
}
