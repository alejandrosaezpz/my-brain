# Valid Anagram

## Platform

LeetCode

## Difficulty

Easy

## Pattern

Frequency map

## Problem summary

Check whether two strings use the same characters with the same counts.

## What this problem teaches

How frequency counting replaces sorting or nested comparison.

## Intuition

If the character counts match exactly, the strings are anagrams.

## Step-by-step approach

1. Reject strings with different lengths.
2. Count characters in one pass.
3. Add one string and subtract the other.
4. Verify that every count returns to zero.

## Java solution

```java
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    Map<Character, Integer> counts = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        counts.merge(s.charAt(i), 1, Integer::sum);
        counts.merge(t.charAt(i), -1, Integer::sum);
    }
    for (int count : counts.values()) {
        if (count != 0) return false;
    }
    return true;
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(n)`

## Edge cases

- empty strings
- different lengths
- repeated characters

## Tests

- positive anagram case
- non-anagram case
- empty strings

## Related problems

- Group Anagrams
- Valid Anagram using frequency map
