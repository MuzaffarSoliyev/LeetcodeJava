package arrays;

import java.util.LinkedList;

public class ValidParentheses {
  public boolean isValid(String s) {
    LinkedList<Character> stack = new LinkedList<>();
    char current, headOfStack;
    for (int i = 0; i < s.length(); i++) {
      current = s.charAt(i);
      if (current == '(' || current == '{' || current == '[') {
        stack.push(current);
      } else {
        if (stack.size() > 0) {
          headOfStack = stack.pop();
          if (!((headOfStack == '(' && current == ')') || (headOfStack == '{' && current == '}') || (headOfStack == '[' && current == ']')))
            return false;
        } else {
          return false;
        }
      }
    }
    return stack.size() == 0;
  }
}
