# Min Stack

## Platform

LeetCode

## Difficulty

Medium

## Pattern

Stack with auxiliary minimum tracking

## Problem summary

Implement a stack that can return the current minimum value in constant time.

## What this problem teaches

How to keep derived state alongside the main stack.

## Intuition

Track the minimum so far each time a value is pushed.

## Step-by-step approach

1. Store values in one stack.
2. Store running minimums in a second stack.
3. Push the new min whenever a smaller value appears.
4. Pop both stacks together when the current minimum leaves.

## Java solution

```java
public void push(int val) {
    values.push(val);
    if (minimums.isEmpty() || val <= minimums.peek()) {
        minimums.push(val);
    }
}
```

## Complexity

- Time complexity: `O(1)` for push, pop, top, and getMin
- Space complexity: `O(n)`

## Edge cases

- duplicate minimum values
- empty stack access
- negative numbers

## Tests

- min tracking through pushes and pops
- duplicate minimum values
- empty access throws

## Related problems

- Valid Parentheses
- Sliding Window Maximum
