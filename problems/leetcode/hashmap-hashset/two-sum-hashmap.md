# Two Sum using HashMap

## Platform

LeetCode-style

## Difficulty

Easy

## Pattern

Hash map lookup

## Problem summary

Find a pair of indices whose values sum to the target using a map.

## What this problem teaches

How to apply complement lookup with a hash map.

## Intuition

Store seen values and check whether the needed complement was already seen.

## Step-by-step approach

1. Create a map from value to index.
2. Scan once.
3. Compute the complement.
4. Return when the complement already exists.

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

- Time complexity: `O(n)` average
- Space complexity: `O(n)`

## Edge cases

- duplicate numbers
- negative numbers
- no solution in local practice code

## Tests

- typical target pair
- duplicate values

## Related problems

- Two Sum
- 3Sum
