package stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class MinStack {

    private final Deque<Integer> values = new ArrayDeque<>();
    private final Deque<Integer> minimums = new ArrayDeque<>();

    public void push(int val) {
        values.push(val);
        if (minimums.isEmpty() || val <= minimums.peek()) {
            minimums.push(val);
        }
    }

    public int pop() {
        ensureNotEmpty();
        int removed = values.pop();
        if (removed == minimums.peek()) {
            minimums.pop();
        }
        return removed;
    }

    public int top() {
        ensureNotEmpty();
        return values.peek();
    }

    public int getMin() {
        ensureNotEmpty();
        return minimums.peek();
    }

    public int size() {
        return values.size();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    private void ensureNotEmpty() {
        if (values.isEmpty()) {
            throw new NoSuchElementException("MinStack is empty");
        }
    }
}
