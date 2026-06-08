# First Unique Character in a String

## Platform

LeetCode

## Difficulty

Easy

## Pattern

Counting + second scan

## Problem summary

Return the index of the first character that appears exactly once.

## What this problem teaches

How to separate counting from decision-making.

## Intuition

Count first, then scan again to find the earliest unique position.

## Step-by-step approach

1. Count every character.
2. Scan the string from left to right.
3. Return the first index with count 1.
4. Return `-1` if none exists.

## Java solution

```java
public int firstUniqChar(String s) {
    Map<Character, Integer> counts = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        counts.merge(s.charAt(i), 1, Integer::sum);
    }
    for (int i = 0; i < s.length(); i++) {
        if (counts.get(s.charAt(i)) == 1) {
            return i;
        }
    }
    return -1;
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(n)`

## Edge cases

- empty string
- all repeated characters
- first character unique

## Tests

- unique at start
- unique in the middle
- no unique character

## Related problems

- Valid Anagram
- Frequency Counter utility
