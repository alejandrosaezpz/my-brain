# Arrays

## 1. What it is

Arrays store values in contiguous indexed positions.

## 2. What it is used for

- fast indexed access
- scanning and filtering
- in-place updates
- pointer-style interview problems

## 3. How to initialize it in Java

```java
int[] nums = { 1, 2, 3 };
int[] scores = new int[5];
```

## 4. Main methods and operations

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| `nums[i]` | Reads an element | element value | `nums[0]` |
| `nums[i] = x` | Writes an element | no value | `nums[1] = 10` |
| `Arrays.sort(nums)` | Sorts the array | `void` | `Arrays.sort(nums)` |
| `Arrays.copyOf` | Copies or resizes | new array | `Arrays.copyOf(nums, 10)` |
| `Arrays.fill` | Fills values | `void` | `Arrays.fill(nums, 0)` |

## 5. Basic examples

```java
int sum = 0;
for (int value : nums) {
    sum += value;
}
```

## 6. How to iterate or use it

- use indexed loops when you need positions
- use `for-each` when position does not matter
- use two pointers for left/right scans
- use prefix or suffix passes for derived values

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| Access by index | `O(1)` | `O(1)` | direct lookup |
| Traverse | `O(n)` | `O(1)` | one pass |
| Insert/delete in middle | `O(n)` | `O(1)` | shifting required |
| Sort | `O(n log n)` | varies | depends on implementation |

## 8. Common mistakes

- forgetting bounds checks
- modifying the array in the wrong direction
- overwriting values before they are reused
- confusing array length with last index

## 9. When to use it in interviews

Use arrays when input is fixed-size, indexing matters, or you need simple traversal with predictable performance.

## 10. Common interview patterns

- two pointers
- sliding window
- prefix sum
- in-place transformation

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Two Sum | LeetCode | Easy | lookup | implemented |
| Contains Duplicate | LeetCode | Easy | set | implemented |
| Best Time to Buy and Sell Stock | LeetCode | Easy | running minimum | implemented |
| Move Zeroes | LeetCode | Easy | in-place two pointers | implemented |
| Product of Array Except Self | LeetCode | Medium | prefix/suffix | implemented |

## 12. Quick checklist

- [ ] know index access is constant time
- [ ] watch for shifting cost
- [ ] choose in-place updates carefully
- [ ] know when a second pass is acceptable
