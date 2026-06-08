# Stack, Queue & Deque

## 1. What it is

A stack is LIFO. A queue is FIFO. A deque supports adding and removing from both ends.

## 2. What it is used for

- parsing and matching brackets
- BFS-style traversal
- monotonic stack ideas
- scheduling and buffering problems

## 3. How to initialize it in Java

```java
Deque<Integer> stack = new ArrayDeque<>();
Deque<Integer> queue = new ArrayDeque<>();
```

## 4. Main methods and operations

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| `push` / `pop` | Stack operations | value / no value | `stack.push(x)` |
| `peek` | Reads top/front | element or `null` | `stack.peek()` |
| `offer` | Adds to queue | `boolean` | `queue.offer(x)` |
| `poll` | Removes from queue | element or `null` | `queue.poll()` |
| `addFirst` / `removeFirst` | Deque front ops | `void` / element | `deque.addFirst(x)` |
| `addLast` / `removeLast` | Deque back ops | `void` / element | `deque.addLast(x)` |

## 5. Basic examples

```java
Deque<Character> stack = new ArrayDeque<>();
stack.push('(');
stack.pop();
```

## 6. How to iterate or use it

- use a stack for last-in-first-out behavior
- use a queue for breadth-first behavior
- use a deque when you need both ends
- prefer `ArrayDeque` over legacy `Stack`

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| Push / pop / peek | `O(1)` | `O(n)` | depending on structure size |
| Offer / poll / peek | `O(1)` | `O(n)` | queue behavior |
| Deque end operations | `O(1)` | `O(n)` | both ends are efficient |

## 8. Common mistakes

- using the wrong end of the deque
- using `Stack` instead of `ArrayDeque`
- forgetting to check for empty structures
- mixing queue and stack semantics

## 9. When to use it in interviews

Use stack/queue/deque when the order of processing matters more than random access.

## 10. Common interview patterns

- valid parentheses
- BFS traversal
- monotonic stacks
- next greater element variants

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Valid Parentheses | LeetCode | Easy | stack matching | implemented |
| Min Stack | LeetCode | Medium | stack with auxiliary tracking | implemented |

## 12. Quick checklist

- [ ] know LIFO vs FIFO
- [ ] prefer `ArrayDeque`
- [ ] check empty cases before pop/peek
- [ ] pick the correct end of the deque
