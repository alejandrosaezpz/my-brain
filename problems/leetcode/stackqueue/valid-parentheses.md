# Valid Parentheses

## Platform

LeetCode

## Difficulty

Easy

## Pattern

Stack matching

## Problem summary

Check whether a bracket string is properly nested and closed.

## What this problem teaches

How to use a stack for matching opening and closing tokens.

## Intuition

Push openings, match closings, and reject mismatches immediately.

## Step-by-step approach

1. Push opening brackets.
2. On a closing bracket, pop and compare.
3. Reject if the stack is empty or the types do not match.
4. Accept only if the stack is empty at the end.

## Java solution

```java
public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
        switch (c) {
            case '(': case '[': case '{' -> stack.push(c);
            case ')' -> { if (stack.isEmpty() || stack.pop() != '(') return false; }
            case ']' -> { if (stack.isEmpty() || stack.pop() != '[') return false; }
            case '}' -> { if (stack.isEmpty() || stack.pop() != '{') return false; }
            default -> { return false; }
        }
    }
    return stack.isEmpty();
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(n)`

## Edge cases

- empty string
- single bracket
- mismatched types

## Tests

- balanced input
- mismatched input
- empty string

## Related problems

- Min Stack
- Daily Temperatures
