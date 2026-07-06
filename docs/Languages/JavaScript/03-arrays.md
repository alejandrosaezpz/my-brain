# Arrays

## 1. What it is

JavaScript arrays are ordered, index-based lists.

## 2. What it is used for

- storing sequences
- traversing collections
- building interview solutions
- transforming data with built-in methods

## 3. Creation

```javascript
const nums = [1, 2, 3];
const empty = [];
const filled = new Array(3).fill(0);
```

## 4. Methods and operations

| Method | Syntax | Complexity | Example | Common interview use case |
| --- | --- | --- | --- | --- |
| `push` | `arr.push(value)` | `O(1)` amortized | `arr.push(4)` | append elements |
| `pop` | `arr.pop()` | `O(1)` | `arr.pop()` | remove from the end |
| `shift` | `arr.shift()` | `O(n)` | `arr.shift()` | queue-style removal |
| `unshift` | `arr.unshift(value)` | `O(n)` | `arr.unshift(0)` | add to the front |
| `splice` | `arr.splice(start, deleteCount, ...items)` | `O(n)` | `arr.splice(1, 1, 9)` | insert/delete in place |
| `slice` | `arr.slice(start, end)` | `O(k)` | `arr.slice(1, 3)` | copy a subarray |
| `concat` | `arr.concat(other)` | `O(n + m)` | `a.concat(b)` | merge arrays |
| `includes` | `arr.includes(value)` | `O(n)` | `arr.includes(3)` | membership checks |
| `indexOf` | `arr.indexOf(value)` | `O(n)` | `arr.indexOf(3)` | find first position |
| `find` | `arr.find(fn)` | `O(n)` | `arr.find(x => x > 5)` | return the matching value |
| `findIndex` | `arr.findIndex(fn)` | `O(n)` | `arr.findIndex(x => x > 5)` | return the matching index |
| `map` | `arr.map(fn)` | `O(n)` | `arr.map(x => x * 2)` | transform every element |
| `filter` | `arr.filter(fn)` | `O(n)` | `arr.filter(x => x > 0)` | keep matching elements |
| `reduce` | `arr.reduce(fn, init)` | `O(n)` | `arr.reduce((s, x) => s + x, 0)` | aggregate into one value |
| `some` | `arr.some(fn)` | `O(n)` early exit | `arr.some(x => x < 0)` | check if any element matches |
| `every` | `arr.every(fn)` | `O(n)` early exit | `arr.every(x => x > 0)` | check if all elements match |
| `flat` | `arr.flat(depth)` | `O(n)` | `arr.flat(1)` | flatten nested arrays |
| `flatMap` | `arr.flatMap(fn)` | `O(n)` | `arr.flatMap(x => [x, x])` | map then flatten one level |
| `sort` | `arr.sort(compareFn)` | `O(n log n)` | `arr.sort((a, b) => a - b)` | ordering data |
| `reverse` | `arr.reverse()` | `O(n)` | `arr.reverse()` | reverse traversal |

## 5. Basic example

```javascript
const evens = nums.filter(n => n % 2 === 0).map(n => n * 10);
```

## 6. How to iterate or use it

- use `for...of` for simple traversal
- use `map` when you want a new transformed array
- use `filter` when you want to keep some items
- use `reduce` when the result is not an array
- use `sort` with a comparator for numbers

## 7. Common mistakes

- forgetting that `sort()` mutates the array
- using `shift()` or `unshift()` in hot loops
- writing `sort()` without a numeric comparator
- expecting `map()` to filter values
- using `reduce()` without an initial value when the array may be empty

## 8. Interview use cases

- frequency counting after sorting
- transformation pipelines with `map` / `filter`
- prefix sums and running totals with `reduce`
- two pointers after sorting
- top-k style problems with sorting or heaps

## 9. Interview notes

- know which methods mutate the original array
- know that `shift` and `unshift` are expensive
- know the difference between `includes`, `indexOf`, `find`, and `findIndex`
- know that callback methods are easy to chain

## 10. Exercises

### Beginner exercises

- append and remove values from an array
- filter even numbers from a list
- map numbers to their squares

### Intermediate exercises

- compute the sum of an array with `reduce`
- find the first matching element with `find`
- sort numbers in ascending order

### Advanced exercises

- solve a two-sum style problem using an array and a map
- flatten nested arrays one level deep
- explain why `shift()` is not ideal for queues

### Recommended LeetCode problems

- Two Sum
- Product of Array Except Self
- 3Sum
- Merge Intervals

### Recommended HackerRank problems

- array manipulation warm-ups
- filtering and transformation exercises
