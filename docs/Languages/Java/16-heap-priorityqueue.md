# Heap & PriorityQueue

## 1. What it is

A heap is a tree-like structure that keeps the smallest or largest item at the root. Java exposes it through `PriorityQueue`.

## 2. What it is used for

- top k problems
- scheduling and ordering
- repeated min/max extraction
- merging sorted streams

## 3. Internal heap implementation

`PriorityQueue` uses an array-backed binary heap.

- parent and children relationships are implicit
- the root is the minimum element by default
- heapify restores order after inserts or removals

## 4. Min Heap vs Max Heap

| Type | Root value | Java setup |
| --- | --- | --- |
| Min heap | smallest | default `PriorityQueue` |
| Max heap | largest | `new PriorityQueue<>(Comparator.reverseOrder())` |

## 5. How to initialize it in Java

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
PriorityQueue<int[]> bySecond = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
```

## 6. Constructors

| Constructor | What it does | Example |
| --- | --- | --- |
| `new PriorityQueue<>()` | creates a min heap | `new PriorityQueue<Integer>()` |
| `new PriorityQueue<>(collection)` | copies items into a heap | `new PriorityQueue<>(list)` |
| `new PriorityQueue<>(comparator)` | uses custom ordering | `new PriorityQueue<>(Comparator.reverseOrder())` |

## 7. Comparator usage

Use a comparator when you want custom ordering, such as max heap behavior or sorting by a field.

```java
PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
```

## 8. Main methods and operations

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| `offer()` | adds an element | `boolean` | `pq.offer(5);` |
| `poll()` | removes and returns the root | element or `null` | `int x = pq.poll();` |
| `peek()` | returns the root without removing it | element or `null` | `int x = pq.peek();` |
| `remove()` | removes the root or a specific item | element / boolean | `pq.remove();` or `pq.remove(5);` |

## 9. Basic examples

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(3);
pq.offer(1);
pq.offer(2);

int smallest = pq.peek(); // 1
int removed = pq.poll();   // 1
```

## 10. How to iterate or use it

- add values one by one
- read the root with `peek()`
- remove with `poll()` when you want the next item
- do not expect sorted iteration

## 11. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| `offer()` | `O(log n)` | `O(1)` | reheapify after insert |
| `peek()` | `O(1)` | `O(1)` | root access only |
| `poll()` | `O(log n)` | `O(1)` | reheapify after removal |
| `remove(Object)` | `O(n)` | `O(1)` | search before removal |

## 12. Common mistakes

- assuming a priority queue is fully sorted
- forgetting that `remove(Object)` is linear
- using the wrong comparator direction for max heap logic
- expecting iteration order to match priority order
- forgetting that `PriorityQueue` does not allow `null`

## 13. When to use it in interviews

- when you need repeated access to the smallest or largest item
- when only the top k items matter
- when tasks must be processed by priority

## 14. Common interview patterns

- top k elements
- k-way merge
- streaming median
- interval scheduling with a heap

## 15. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Top K Frequent Elements | LeetCode | Medium | top k | TODO |
| Kth Largest Element in a Stream | LeetCode | Easy | streaming heap | TODO |
| Merge k Sorted Lists | LeetCode | Hard | k-way merge | TODO |

## 16. Quick checklist

- [ ] know when the root is min vs max
- [ ] use a comparator for custom ordering
- [ ] remember `poll()` is logarithmic
