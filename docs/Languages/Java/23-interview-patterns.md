# Interview Patterns

## 1. What it is

Interview patterns are repeatable ways to recognize what a problem is really asking.

## 2. What it is used for

- quickly choose a strategy
- reduce brute force solutions
- explain your reasoning clearly
- connect the problem to a known technique

## 3. How to recognize it in Java interviews

Look for keywords like duplicate, frequency, sorted, window, path, interval, or top k.

## 4. Pattern mapping table

| Problem pattern | Recommended technique | Why it fits | Representative LeetCode problem |
| --- | --- | --- | --- |
| Contains duplicates | `HashSet` | membership checks are fast | Contains Duplicate |
| Count frequencies | `HashMap` | store counts by value | Valid Anagram |
| Fast lookup | `HashMap` | key-based access is `O(1)` average | Two Sum |
| Unique elements | `HashSet` | automatically removes duplicates | Intersection of Two Arrays |
| Top K elements | `PriorityQueue` | keep only the best K values | Top K Frequent Elements |
| Sorted array search | Binary Search | halve the search space | Search in Rotated Sorted Array |
| Two indices moving together | Two Pointers | scan from both ends or at different speeds | Valid Palindrome |
| Subarray problems | Sliding Window | keep a moving range | Longest Substring Without Repeating Characters |
| Running cumulative values | Prefix Sum | answer range queries quickly | Range Sum Query - Immutable |
| Tree traversal | DFS / BFS | visit nodes by depth or level | Binary Tree Level Order Traversal |
| Scheduling / intervals | Greedy | choose the best local action | Non-overlapping Intervals |

## 5. Short explanations

- **HashSet:** use it when you only need to know whether something was seen before.
- **HashMap:** use it when each value needs a count, index, or associated data.
- **PriorityQueue:** use it when you need repeated access to the smallest or largest item.
- **Binary Search:** use it when the answer space is sorted or monotonic.
- **Two Pointers:** use it when two positions can move in a coordinated way.
- **Sliding Window:** use it when the problem asks for a contiguous subarray or substring.
- **Prefix Sum:** use it when repeated range sums appear.
- **DFS / BFS:** use it when the structure is tree-like or graph-like.
- **Greedy:** use it when local choices can be justified as globally optimal.

## 6. How to use it in interviews

1. Identify the input shape.
2. Match it to a known pattern.
3. State the complexity out loud.
4. Mention the tradeoff if there is more than one good approach.

## 7. Common mistakes

- forcing a pattern that does not fit
- forgetting to mention why the pattern works
- ignoring edge cases like empty input or duplicates
- using a heavier technique when a simpler one is enough

## 8. When to use it in interviews

Use pattern recognition early to avoid wasting time on brute force.

## 9. Common interview patterns

- hash-based lookup
- sorted traversal
- window expansion and shrink
- traversal by levels or depth
- greedy interval selection

## 10. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Two Sum | LeetCode | Easy | HashMap | TODO |
| Longest Substring Without Repeating Characters | LeetCode | Medium | Sliding Window | TODO |
| Search in Rotated Sorted Array | LeetCode | Medium | Binary Search | TODO |

## 11. Quick checklist

- [ ] identify the keyword clues
- [ ] name the technique clearly
- [ ] mention complexity and tradeoffs
