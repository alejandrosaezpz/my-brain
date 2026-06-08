# Move Zeroes

## Platform

LeetCode

## Difficulty

Easy

## Pattern

Two pointers / in-place write index

## Problem summary

Move all zeros to the end while keeping the order of non-zero values.

## What this problem teaches

How to compact useful values in place without extra storage.

## Intuition

Keep one pointer for where the next non-zero should go.

## Step-by-step approach

1. Keep an insert index at 0.
2. Scan the array.
3. When a non-zero appears, swap it into the insert position.
4. Advance the insert position.

## Java solution

```java
public void moveZeroes(int[] nums) {
    int insertIndex = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            int temp = nums[insertIndex];
            nums[insertIndex] = nums[i];
            nums[i] = temp;
            insertIndex++;
        }
    }
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(1)`

## Edge cases

- all zeros
- no zeros
- already sorted by zeros

## Tests

- typical mixed input
- all zeros
- no zeros

## Related problems

- Product of Array Except Self
- Remove Element
