# Valid Anagram using frequency map

## Platform

LeetCode-style

## Difficulty

Easy

## Pattern

Frequency map

## Problem summary

Use a count map to determine whether two strings are anagrams.

## What this problem teaches

How to count and compare values without sorting.

## Intuition

If every character count balances to zero, the strings match.

## Step-by-step approach

1. Reject different-length strings.
2. Count one string up and the other down.
3. Verify all counts are zero.

## Java solution

```java
public boolean isAnagram(String s, String t) {
    Map<Character, Integer> counts = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        counts.merge(s.charAt(i), 1, Integer::sum);
        counts.merge(t.charAt(i), -1, Integer::sum);
    }
    for (int value : counts.values()) {
        if (value != 0) return false;
    }
    return true;
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(n)`

## Edge cases

- empty strings
- repeated letters
- different lengths

## Tests

- valid anagram
- invalid pair

## Related problems

- Valid Anagram
- Group Anagrams
