package integers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public List<String> fizzBuzz(int n) {
    List<String> answer = new ArrayList<>();
    StringBuilder result;
    for (int i = 1; i <= n; i++) {
      result = new StringBuilder("");
      if (i % 3 == 0 || i % 5 == 0) {
        if (i % 3 == 0) {
          result.append("Fizz");
        }
        if (i % 5 == 0) {
          result.append("Buzz");
        }
      } else {
        result.append(i);
      }
      answer.add(result.toString());
    }
    return answer;
  }
}
