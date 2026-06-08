# Dynamic Array

## Platform

Custom

## Difficulty

Easy-Medium

## Pattern

Resizable array implementation

## Problem summary

Implement a small generic list that grows as items are added.

## What this problem teaches

How ArrayList-style resizing works under the hood.

## Intuition

Keep an internal array, grow it when needed, and shift values on insert/remove.

## Step-by-step approach

1. Store elements in an `Object[]`.
2. Double the capacity when the array fills up.
3. Shift values on indexed insert and removal.
4. Provide `get`, `set`, `remove`, `clear`, and `size`.

## Java solution

```java
public void add(T value) {
    ensureCapacity(size + 1);
    elements[size++] = value;
}
```

## Complexity

- Time complexity: amortized `O(1)` for append, `O(n)` for indexed insert/remove
- Space complexity: `O(n)`

## Edge cases

- resizing at capacity
- invalid indexes
- clearing a non-empty list

## Tests

- append and read
- resize and remove
- bounds checks

## Related problems

- ArrayList & Java Collections
- Frequency Counter
