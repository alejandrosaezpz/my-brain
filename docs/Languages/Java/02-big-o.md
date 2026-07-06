# Big O

## 1. What it is

Big O describes how runtime and memory grow as input size grows.

## 2. What it is used for

- comparing approaches
- explaining tradeoffs
- estimating interview performance
- choosing the right data structure

## 3. How to initialize it in Java

Big O is an analysis tool, so there is no Java object to create. You describe the complexity of Java code such as loops, recursion, and collection operations.

## 4. Main methods and operations

### Data structure complexity table

`Access` means indexed access or the usual top/front lookup for stack-style structures.

| Data structure | Access | Search | Insert | Delete | Notes |
| --- | --- | --- | --- | --- | --- |
| Array | `O(1)` | `O(n)` | `O(n)` | `O(n)` | append is `O(1)` if capacity already exists |
| ArrayList | `O(1)` | `O(n)` | `O(n)` | `O(n)` | append is amortized `O(1)` |
| LinkedList | `O(n)` | `O(n)` | `O(1)` | `O(1)` | at a known node; locating the node still costs `O(n)` |
| HashMap | `O(1)` avg | `O(1)` avg | `O(1)` avg | `O(1)` avg | key-based lookup |
| HashSet | `O(1)` avg | `O(1)` avg | `O(1)` avg | `O(1)` avg | set membership check |
| Stack | `O(1)` | `O(n)` | `O(1)` | `O(1)` | top access with `peek()` |
| Queue | `O(1)` | `O(n)` | `O(1)` | `O(1)` | front access with `peek()` |
| PriorityQueue | `O(1)` | `O(n)` | `O(log n)` | `O(log n)` | heap root access with `peek()` |

### Sorting algorithm complexity

| Algorithm | Best | Average | Worst | Stable | In-place |
| --- | --- | --- | --- | --- | --- |
| Bubble Sort | `O(n)` | `O(n^2)` | `O(n^2)` | Yes | Yes |
| Selection Sort | `O(n^2)` | `O(n^2)` | `O(n^2)` | No | Yes |
| Insertion Sort | `O(n)` | `O(n^2)` | `O(n^2)` | Yes | Yes |
| Merge Sort | `O(n log n)` | `O(n log n)` | `O(n log n)` | Yes | No |
| Heap Sort | `O(n log n)` | `O(n log n)` | `O(n log n)` | No | Yes |
| Quick Sort | `O(n log n)` | `O(n log n)` | `O(n^2)` | No | Yes |

### Complexity ladder

```text
O(1)
  ↓
O(log n)
  ↓
O(n)
  ↓
O(n log n)
  ↓
O(n²)
  ↓
O(2ⁿ)
  ↓
O(n!)
```

| Complexity | Practical interview example |
| --- | --- |
| `O(1)` | `map.get(key)` or `stack.peek()` |
| `O(log n)` | binary search on a sorted array |
| `O(n)` | scan once to find the max value |
| `O(n log n)` | sort first, then sweep with two pointers |
| `O(n²)` | compare every pair in a brute-force search |
| `O(2ⁿ)` | generate all subsets |
| `O(n!)` | generate all permutations |

### Core operation examples

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| Single loop | Processes each item once | `O(n)` | `for (int n : nums)` |
| Nested loops | Checks pairs or combinations | `O(n^2)` | double `for` loop |
| Binary search | Halves the search space | `O(log n)` | sorted array search |
| Hash lookup | Average constant-time access | `O(1)` average | `map.get(key)` |
| Sort then scan | Orders data before checking | `O(n log n)` | `Arrays.sort(nums)` |

## 5. Basic examples

```java
// O(n)
for (int value : nums) {
    total += value;
}
```

```java
// O(log n)
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) break;
    if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
```

## 6. How to iterate or use it

- count loops
- identify extra passes
- include recursion depth when needed
- check whether a hash structure changes the average cost

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| Scan once | `O(n)` | `O(1)` | one pass |
| Scan twice | `O(n)` | `O(1)` | still linear if passes are separate |
| Nested scan | `O(n^2)` | `O(1)` | pairwise work |
| Recursive branching | often `O(2^n)` or worse | call stack | depends on branching factor |
| Divide and conquer | `O(n log n)` | usually extra stack or buffer | common in sorting and search |

## 8. Common mistakes

- ignoring hidden nested work
- forgetting recursion stack space
- claiming `HashMap` is always `O(1)` without noting average case
- forgetting sort cost before a scan

## 9. When to use it in interviews

Always. Big O is part of the explanation, not an afterthought.

## 10. Common interview patterns

- brute force versus optimized solution
- hash map tradeoff explanations
- recursion versus iteration
- sorting as a preprocessing step
- counting and frequency tables
- binary search on a monotonic condition

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Analyze Two Sum | Custom | Easy | lookup | TODO |
| Compare nested loops | Custom | Easy | complexity reasoning | TODO |

## 12. Quick checklist

- [ ] identify the dominant step
- [ ] mention average vs worst case where relevant
- [ ] include extra space
- [ ] keep the explanation short
