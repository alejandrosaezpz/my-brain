# Two Sum

## Platform

LeetCode

## Difficulty

Easy

## Pattern

Hash map / complement lookup

## Problem summary

Find two indices whose values add up to the target.

## What this problem teaches

How to trade nested loops for a single pass with a lookup table.

## Intuition

Store the numbers you have already seen. For each new number, check whether its complement already exists in the map.

## Step-by-step approach

1. Create a map from number to index.
2. Scan the array once.
3. For each value, compute `target - value`.
4. If the complement exists, return both indices.
5. Otherwise, store the current number.

## Java solution

```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> seen = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (seen.containsKey(complement)) {
            return new int[] { seen.get(complement), i };
        }
        seen.put(nums[i], i);
    }
    return new int[0];
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(n)`

## Edge cases

- duplicate values
- no valid pair
- negative numbers
- smallest input size

## Tests

- normal pair search
- duplicate values
- no-solution fallback

## Related problems

- Contains Duplicate
- Two Sum using HashMap
- 3Sum
