# Contains Duplicate

## Platform

LeetCode

## Difficulty

Easy

## Pattern

Hash set

## Problem summary

Determine whether any number appears more than once.

## What this problem teaches

How a set removes the need for pairwise comparison.

## Intuition

If a value has already been seen, the answer is immediately true.

## Step-by-step approach

1. Create a set.
2. Scan the array.
3. Add each number to the set.
4. If `add` fails, a duplicate exists.

## Java solution

```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
        if (!seen.add(num)) {
            return true;
        }
    }
    return false;
}
```

## Complexity

- Time complexity: `O(n)` average
- Space complexity: `O(n)`

## Edge cases

- empty array
- single element
- all values unique

## Tests

- duplicates present
- all unique values
- empty input

## Related problems

- Two Sum
- Valid Anagram using frequency map
