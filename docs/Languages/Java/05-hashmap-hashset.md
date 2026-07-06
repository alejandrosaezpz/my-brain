# HashMap & HashSet

## 1. What it is

HashMap stores key-value pairs. HashSet stores unique values.

## 2. What it is used for

- fast lookup
- counting frequencies
- detecting duplicates
- grouping values by a key

## 3. How to initialize it in Java

```java
Map<Integer, Integer> map = new HashMap<>();
Set<Integer> set = new HashSet<>();
```

## 4. Main methods and operations

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| `put(key, value)` | Stores a mapping | previous value or `null` | `map.put(1, 2)` |
| `get(key)` | Reads a value | value or `null` | `map.get(1)` |
| `getOrDefault` | Reads with fallback | value or default | `map.getOrDefault(x, 0)` |
| `containsKey` | Checks key existence | `boolean` | `map.containsKey(k)` |
| `add(value)` | Inserts into a set | `boolean` | `set.add(x)` |
| `contains(value)` | Checks set membership | `boolean` | `set.contains(x)` |

## 5. Basic examples

```java
Map<Character, Integer> counts = new HashMap<>();
for (char c : text.toCharArray()) {
    counts.merge(c, 1, Integer::sum);
}
```

## 6. How to iterate or use it

- use `merge` or `getOrDefault` for frequency counting
- use `containsKey` before reading when needed
- use `HashSet` for uniqueness checks
- use a map when you need to remember positions or counts

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| `put` / `get` / `containsKey` | average `O(1)` | `O(n)` | average case |
| `add` / `contains` on `HashSet` | average `O(1)` | `O(n)` | average case |
| iterate all entries | `O(n)` | `O(1)` | one full scan |

## 8. Common mistakes

- assuming worst-case and average-case are the same
- forgetting to handle missing keys
- using a map when a set is enough
- mutating counts incorrectly in one-pass logic

## 9. When to use it in interviews

Use a HashMap or HashSet when you need fast membership checks, counts, or grouping.

## 10. Common interview patterns

- two sum with a map
- frequency counting
- grouping anagrams
- top-k problems with counting

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Two Sum | LeetCode | Easy | complement lookup | implemented |
| Valid Anagram | LeetCode | Easy | frequency map | implemented |
| Group Anagrams | LeetCode | Medium | grouping by key | implemented |
| Top K Frequent Elements | LeetCode | Medium | counting + buckets | implemented |

## 12. Quick checklist

- [ ] know when a map beats nested loops
- [ ] use a set for duplicates
- [ ] handle missing keys safely
- [ ] explain average-case complexity clearly
