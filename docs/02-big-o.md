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
