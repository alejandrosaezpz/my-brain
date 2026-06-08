# Valid Palindrome

## Platform

LeetCode

## Difficulty

Easy

## Pattern

Two pointers

## Problem summary

Check whether a string reads the same forward and backward after ignoring non-alphanumeric characters and case.

## What this problem teaches

How to scan from both ends while filtering unwanted characters.

## Intuition

Move inward from both sides until you find characters worth comparing.

## Step-by-step approach

1. Start pointers at both ends.
2. Skip punctuation and spaces.
3. Compare normalized characters.
4. Stop early on mismatch.

## Java solution

```java
public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(1)`

## Edge cases

- empty string
- single character
- strings with only punctuation

## Tests

- classic palindrome sentence
- mismatch case
- empty input

## Related problems

- Valid Parentheses
- Longest Palindromic Substring
