# Longest Substring Without Repeating Characters

## Platform

LeetCode

## Difficulty

Medium

## Pattern

Sliding window

## Problem summary

Find the longest contiguous substring with no repeated characters.

## What this problem teaches

How to maintain a moving window and shrink it when a constraint breaks.

## Intuition

Keep the window valid by jumping the left side past the last repeated character.

## Step-by-step approach

1. Track the last seen index of each character.
2. Expand the right pointer.
3. If a repeated character is inside the current window, move `left` forward.
4. Update the best window length.

## Java solution

```java
public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> lastSeen = new HashMap<>();
    int left = 0;
    int best = 0;
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        Integer previous = lastSeen.get(c);
        if (previous != null && previous >= left) {
            left = previous + 1;
        }
        lastSeen.put(c, right);
        best = Math.max(best, right - left + 1);
    }
    return best;
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(min(n, charset))`

## Edge cases

- empty string
- all repeated characters
- all unique characters

## Tests

- repeated blocks
- fully repeated characters
- empty input

## Related problems

- Minimum Window Substring
- Longest Repeating Character Replacement
