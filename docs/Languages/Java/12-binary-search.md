# Binary Search

## 1. What it is

Binary search finds a target by repeatedly cutting the search space in half.

## 2. What it is used for

- sorted arrays
- monotonic predicates
- boundary and answer-space problems

## 3. When Binary Search can be applied

Use binary search when the answer space is ordered or can be tested with a yes/no condition.

## 4. Standard iterative template

```java
int left = 0;
int right = nums.length - 1;

while (left <= right) {
    int mid = left + (right - left) / 2;

    if (nums[mid] == target) {
        return mid;
    } else if (nums[mid] < target) {
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}

return -1;
```

## 5. Recursive version

```java
int search(int[] nums, int target, int left, int right) {
    if (left > right) return -1;

    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    if (nums[mid] < target) return search(nums, target, mid + 1, right);
    return search(nums, target, left, mid - 1);
}
```

## 6. How to initialize it in Java

There is no object to create for the algorithm itself. In Java you either write the loop manually or use `Arrays.binarySearch()` on a sorted array.

## 7. Main methods and operations

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| Iterative search | Finds an exact target | index or `-1` | sorted array lookup |
| Recursive search | Same logic with recursion | index or `-1` | helper method |
| Boundary search | Finds first/last valid position | boundary index | lower/upper bound |
| Answer search | Finds the best feasible answer | answer value | capacity / speed problems |

## 8. Basic examples

```java
int index = Arrays.binarySearch(nums, target);
```

If the target is missing, `Arrays.binarySearch()` returns `-(insertionPoint) - 1`.

## 9. How to iterate or use it

- keep the search space sorted or monotonic
- decide whether you need an exact match or a boundary
- shrink the range until it disappears
- handle duplicates carefully when looking for the first/last position

## 10. Overflow-safe midpoint calculation

Use this form instead of `(left + right) / 2`:

```java
int mid = left + (right - left) / 2;
```

## 11. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| Exact search | `O(log n)` | `O(1)` iterative | halves the range |
| Boundary search | `O(log n)` | `O(1)` iterative | first/last position |
| Recursive binary search | `O(log n)` | `O(log n)` stack | recursion depth |

## 12. Common mistakes

- using binary search on unsorted data
- updating `left` or `right` incorrectly
- forgetting the midpoint overflow issue
- stopping too early when duplicates matter
- mixing exact-match logic with boundary-search logic

## 13. When to use it in interviews

- when the input is sorted
- when the search space is monotonic
- when the problem asks for a minimum feasible answer

## 14. Common interview patterns

- search in rotated sorted array
- first bad version
- find first/last occurrence
- capacity / speed / threshold problems

## 15. Typical interview problems

- Search in Rotated Sorted Array
- Find First and Last Position of Element in Sorted Array
- First Bad Version
- Koko Eating Bananas
- Capacity To Ship Packages Within D Days

## 16. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Binary search basics | Custom | Easy | exact search | TODO |
| First bad version | LeetCode | Easy | boundary search | TODO |
| Koko eating bananas | LeetCode | Medium | answer search | TODO |

## 17. Quick checklist

- [ ] confirm the input is sorted or monotonic
- [ ] choose exact search vs boundary search
- [ ] use overflow-safe midpoint calculation
