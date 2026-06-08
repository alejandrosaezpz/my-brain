# Best Time to Buy and Sell Stock

## Platform

LeetCode

## Difficulty

Easy

## Pattern

Running minimum

## Problem summary

Choose one buy day and one later sell day to maximize profit.

## What this problem teaches

How to track a best-so-far value during a single pass.

## Intuition

At each day, the best profit ends at that day if you bought at the lowest price seen so far.

## Step-by-step approach

1. Track the minimum price seen.
2. Track the best profit seen.
3. For each price, update the profit using the current minimum.
4. Update the minimum price if the current value is smaller.

## Java solution

```java
public int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int best = 0;
    for (int i = 1; i < prices.length; i++) {
        best = Math.max(best, prices[i] - minPrice);
        minPrice = Math.min(minPrice, prices[i]);
    }
    return best;
}
```

## Complexity

- Time complexity: `O(n)`
- Space complexity: `O(1)`

## Edge cases

- descending prices
- single price
- empty input in local practice code

## Tests

- normal profit case
- decreasing prices
- single element

## Related problems

- Maximum Subarray
- Best Time to Buy and Sell Stock II
