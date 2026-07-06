# JavaScript Interview Patterns

## 1. What it is

Repeatable problem shapes that help you choose the right data structure or algorithm quickly.

## 2. What it is used for

- recognizing patterns early
- avoiding brute force
- explaining your approach clearly
- choosing the right built-in structure

## 3. Pattern recognition table

| Pattern | When to recognize it | Recommended data structures | Complexity goal | Representative problem |
| --- | --- | --- | --- | --- |
| Counting frequencies | repeated values, duplicates, anagrams | `Map`, object | `O(n)` | Valid Anagram |
| Removing duplicates | unique values or deduped output | `Set` | `O(n)` | Contains Duplicate |
| Grouping data | categories, buckets, partitions | `Map` | `O(n)` | Group Anagrams |
| Sorting objects | order by key, score, or timestamp | array + comparator | `O(n log n)` | Merge Intervals |
| Filtering collections | keep only matching items | `filter` | `O(n)` | Remove falsy values |
| Transforming arrays | convert one shape into another | `map` | `O(n)` | normalize records |
| Finding max/min | best/worst element, running result | loop or `reduce` | `O(n)` | maximum subarray-style warmups |
| Two Sum | target sum with complement lookup | `Map`, object | `O(n)` | Two Sum |
| Prefix Sum | repeated range sum queries | array + prefix array | `O(n)` preprocess, `O(1)` query | Range sum style tasks |
| Sliding Window | contiguous subarray or substring | two pointers + counts | `O(n)` | Longest Substring Without Repeating Characters |
| Two Pointers | sorted arrays or opposite ends | left/right indices | `O(n)` | Valid Palindrome |
| Binary Search | sorted input or monotonic answer | index boundaries | `O(log n)` | Binary Search |

## 4. How to recognise the pattern

- ask whether the input repeats, sorts, groups, or scans a contiguous range
- look for words like unique, frequency, longest, shortest, sorted, target, range, or window
- choose the smallest structure that supports the needed lookup or grouping

## 5. Common mistakes

- forcing the wrong pattern
- ignoring the time cost of array mutations
- forgetting to mention complexity
- using a full sort when a lookup structure is enough

## 6. Interview notes

- say the pattern name early
- name the data structure you will use
- explain why the pattern fits the input shape
- mention the complexity before coding

## 7. Exercises

### Beginner exercises

- detect whether a problem needs counting or deduplication
- explain why `Set` helps with duplicates
- identify a sorted-array problem

### Intermediate exercises

- solve Two Sum with a lookup structure
- solve a frequency-counting problem
- solve a sliding-window substring problem

### Advanced exercises

- compare two-pointer and binary search strategies
- explain why prefix sums help range queries
- group items by category using a `Map`

### Recommended LeetCode problems

- Two Sum
- Group Anagrams
- Longest Substring Without Repeating Characters
- Search in Rotated Sorted Array

### Recommended HackerRank problems

- frequency counting drills
- window and lookup practice sets
