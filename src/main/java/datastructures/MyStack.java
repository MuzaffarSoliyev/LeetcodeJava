package datastructures;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> stack;

    public MyStack() {
        stack = new ArrayList<Integer>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        return stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
