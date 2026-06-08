# Frequency Counter

## Platform

Custom

## Difficulty

Easy

## Pattern

Utility / frequency counting

## Problem summary

Build a small reusable helper for counting integers and characters.

## What this problem teaches

How to write a tiny utility that simplifies many interview problems.

## Intuition

Counting is a reusable pattern; wrapping it in a utility keeps practice code clean.

## Step-by-step approach

1. Create a static utility class.
2. Count items with a map.
3. Return the map for later use.

## Java solution

```java
public static Map<Integer, Integer> countIntegers(int[] values) {
    Map<Integer, Integer> counts = new LinkedHashMap<>();
    for (int value : values) {
        counts.merge(value, 1, Integer::sum);
    }
    return counts;
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(n)`

## Edge cases

- null input in helper code
- empty input
- repeated values

## Tests

- integer counting
- character counting

## Related problems

- Valid Anagram
- First Unique Character in a String
