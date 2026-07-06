# Sorting

## 1. What it is

Sorting arranges values in a chosen order, usually ascending or descending.

## 2. What it is used for

- makes duplicates easier to spot
- enables binary search
- simplifies two-pointer logic
- helps with grouping and interval problems

## 3. How to initialize it in Java

Use `Arrays.sort()` for arrays and `Collections.sort()` for lists.

```java
Arrays.sort(nums);
Collections.sort(list);
list.sort(Comparator.reverseOrder());
```

## 4. Main methods and operations

| Algorithm | Core idea | Best | Average | Worst | Stable | In-place |
| --- | --- | --- | --- | --- | --- | --- |
| Bubble Sort | Repeatedly swap adjacent out-of-order elements | `O(n)` | `O(n^2)` | `O(n^2)` | Yes | Yes |
| Selection Sort | Repeatedly select the smallest remaining element | `O(n^2)` | `O(n^2)` | `O(n^2)` | No | Yes |
| Insertion Sort | Insert each element into the sorted prefix | `O(n)` | `O(n^2)` | `O(n^2)` | Yes | Yes |
| Merge Sort | Split, sort halves, then merge | `O(n log n)` | `O(n log n)` | `O(n log n)` | Yes | No |
| Heap Sort | Build a heap, then extract extremes | `O(n log n)` | `O(n log n)` | `O(n log n)` | No | Yes |
| Quick Sort | Partition around a pivot | `O(n log n)` | `O(n log n)` | `O(n^2)` | No | Yes |

### Bubble sort

- **Core idea:** swap adjacent elements until the largest value bubbles to the end.
- **Typical use case:** very small inputs or teaching the sorting idea.
- **Interview note:** easy to explain, but rarely the best final answer.

### Selection sort

- **Core idea:** select the smallest remaining item and place it next.
- **Typical use case:** when swaps are expensive but comparisons are cheap.
- **Interview note:** simple, but usually too slow for production.

### Insertion sort

- **Core idea:** grow a sorted prefix one element at a time.
- **Typical use case:** nearly sorted data or tiny arrays.
- **Interview note:** often a good fallback inside hybrid sorts.

### Merge sort

- **Core idea:** divide the array, sort both halves, then merge.
- **Typical use case:** when stability matters or worst-case `O(n log n)` is required.
- **Interview note:** needs extra memory for merging.

### Heap sort

- **Core idea:** use a heap to repeatedly remove the next smallest/largest value.
- **Typical use case:** when you want `O(n log n)` with in-place behavior.
- **Interview note:** usually slower in practice than quicksort or merge sort.

### Quick sort

- **Core idea:** partition items around a pivot, then sort the partitions.
- **Typical use case:** general-purpose sorting when average speed matters.
- **Interview note:** worst case is `O(n^2)` unless pivot choice is managed well.

## 5. Basic examples

```java
int[] nums = {5, 2, 9, 1};
Arrays.sort(nums);
// [1, 2, 5, 9]
```

## 6. How to iterate or use it

- decide whether stability matters
- decide whether extra memory is acceptable
- use a comparator when sorting objects
- remember that sorting usually costs `O(n log n)`

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| Sort primitive array with `Arrays.sort(int[])` | `O(n log n)` | `O(log n)` stack | dual-pivot quicksort |
| Sort object array with `Arrays.sort(T[])` | `O(n log n)` | `O(n)` | stable merge-based sort |
| Sort list with `Collections.sort(List)` | `O(n log n)` | `O(n)` | delegates to list sort |

## 8. Common mistakes

- forgetting the sort cost before optimizing
- using the wrong comparator direction
- assuming all sorts are stable
- assuming `Arrays.sort` uses the same algorithm for primitives and objects

## 9. When to use it in interviews

- when ordering unlocks a simpler solution
- when you need deduplication after sorting
- when two pointers become possible on sorted data

## 10. Common interview patterns

- sort + two pointers
- sort + greedy interval logic
- sort + sweep line style counting
- sort + binary search on answers
- sort + heap for top-k or merging

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Merge intervals | LeetCode | Medium | sort + greedy | TODO |
| Meeting rooms | LeetCode | Medium | sort + heap | TODO |
| Kth largest element | LeetCode | Medium | heap / quickselect | TODO |

## 12. Quick checklist

- [ ] know the sort cost before optimizing
- [ ] choose the right stability guarantee
- [ ] use a comparator for object sorting
