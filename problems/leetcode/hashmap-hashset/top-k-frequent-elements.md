# Top K Frequent Elements

## Platform

LeetCode

## Difficulty

Medium

## Pattern

Counting + bucket sort

## Problem summary

Return the `k` values that appear most often.

## What this problem teaches

How to combine frequency counting with linear-time bucket grouping.

## Intuition

Frequency determines bucket position; higher frequency means a later bucket.

## Step-by-step approach

1. Count each number.
2. Put each number into a bucket by frequency.
3. Walk buckets from high to low.
4. Collect results until `k` values are found.

## Java solution

```java
public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frequency = new HashMap<>();
    for (int num : nums) {
        frequency.merge(num, 1, Integer::sum);
    }

    List<Integer>[] buckets = new List[nums.length + 1];
    for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
        int count = entry.getValue();
        if (buckets[count] == null) {
            buckets[count] = new ArrayList<>();
        }
        buckets[count].add(entry.getKey());
    }

    int[] result = new int[Math.min(k, frequency.size())];
    int index = 0;
    for (int count = buckets.length - 1; count >= 0 && index < result.length; count--) {
        if (buckets[count] == null) {
            continue;
        }
        for (int value : buckets[count]) {
            result[index++] = value;
            if (index == result.length) {
                break;
            }
        }
    }

    return result;
}
```

## Complexity

- Time complexity: `O(n)` average
- Space complexity: `O(n)`

## Edge cases

- `k` equals 0
- negative numbers
- `k` larger than unique count

## Tests

- standard top-k case
- negative number case
- non-positive `k`

## Related problems

- Group Anagrams
- Top K Frequent Words
