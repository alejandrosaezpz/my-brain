# Product of Array Except Self

## Platform

LeetCode

## Difficulty

Medium

## Pattern

Prefix / suffix accumulation

## Problem summary

Return an array where each position contains the product of all other values.

## What this problem teaches

How to avoid division by combining prefix and suffix products.

## Intuition

Each answer is the product of everything to the left times everything to the right.

## Step-by-step approach

1. Build prefix products into the result array.
2. Walk backward with a suffix product.
3. Multiply each result slot by the current suffix value.

## Java solution

```java
public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    int prefix = 1;
    for (int i = 0; i < nums.length; i++) {
        result[i] = prefix;
        prefix *= nums[i];
    }
    int suffix = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
        result[i] *= suffix;
        suffix *= nums[i];
    }
    return result;
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(1)` extra space, excluding output

## Edge cases

- single element
- zero values
- empty input in local practice code

## Tests

- normal product case
- zero handling
- single value input

## Related problems

- Prefix Sum
- Subarray Product Less Than K
