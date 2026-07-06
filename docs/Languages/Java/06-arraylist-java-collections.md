# ArrayList & Java Collections

## 1. What it is

ArrayList is a resizable list implementation. The Collections utility class provides helpful algorithms and helpers for Java collections.

## 2. What it is used for

- storing ordered data
- dynamic growth
- list operations in interview solutions
- sorting and reversing collections

## 3. How to initialize it in Java

```java
List<Integer> list = new ArrayList<>();
```

## 4. Main methods and operations

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| `add(value)` | Appends to the end | `boolean` | `list.add(1)` |
| `get(index)` | Reads by index | element | `list.get(0)` |
| `set(index, value)` | Replaces value | previous element | `list.set(0, 9)` |
| `remove(index)` | Removes by index | removed element | `list.remove(0)` |
| `Collections.sort(list)` | Sorts a list | `void` | `Collections.sort(list)` |
| `Collections.reverse(list)` | Reverses a list | `void` | `Collections.reverse(list)` |

## 5. Basic examples

```java
List<String> names = new ArrayList<>();
names.add("Ada");
names.add("Linus");
```

## 6. How to iterate or use it

- use indexed loops when positions matter
- use `ArrayList` when you need fast end inserts and indexed reads
- use `Collections` helpers for common operations
- use `List` in method signatures when possible

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| `add` at end | amortized `O(1)` | `O(n)` | resizing happens occasionally |
| `get` / `set` | `O(1)` | `O(1)` | direct access |
| `remove` at index | `O(n)` | `O(1)` | shifts elements |
| `Collections.sort` | `O(n log n)` | varies | uses comparator-based sorting |

## 8. Common mistakes

- removing elements while iterating without care
- assuming insertions in the middle are cheap
- using raw `ArrayList` instead of `List`
- confusing `Collections` with `Collection`

## 9. When to use it in interviews

Use ArrayList when you want ordered storage with simple indexed access and convenient list operations.

## 10. Common interview patterns

- building answer lists
- sorting before scanning
- grouping results
- dynamic list accumulation

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Dynamic Array | Custom | Easy | resizable structure | implemented |
| Frequency Counter | Custom | Easy | counting utility | implemented |

## 12. Quick checklist

- [ ] know end-add is amortized constant time
- [ ] remember middle removal shifts values
- [ ] use interfaces in variables when possible
- [ ] use Collections helpers when they simplify code
