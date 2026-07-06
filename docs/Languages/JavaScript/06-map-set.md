# Map & Set

## 1. What it is

`Map` stores key-value pairs. `Set` stores unique values. `WeakMap` and `WeakSet` hold weak references for object keys and values.

## 2. What it is used for

- fast lookups
- frequency counting
- deduplication
- membership checks
- caching object metadata

## 3. Creation

```javascript
const map = new Map([["a", 1]]);
const set = new Set([1, 2, 2, 3]);
const weakMap = new WeakMap();
const weakSet = new WeakSet();
```

## 4. Main methods and operations

| Type | Method | Syntax | Complexity | Example | When to use |
| --- | --- | --- | --- | --- | --- |
| Map | `set` | `map.set(key, value)` | `O(1)` average | `map.set("a", 1)` | store keyed data |
| Map | `get` | `map.get(key)` | `O(1)` average | `map.get("a")` | read a value |
| Map | `has` | `map.has(key)` | `O(1)` average | `map.has("a")` | membership test |
| Map | `delete` | `map.delete(key)` | `O(1)` average | `map.delete("a")` | remove a key |
| Map | `clear` | `map.clear()` | `O(n)` | `map.clear()` | reset everything |
| Set | `add` | `set.add(value)` | `O(1)` average | `set.add(3)` | insert a unique value |
| Set | `has` | `set.has(value)` | `O(1)` average | `set.has(3)` | membership test |
| Set | `delete` | `set.delete(value)` | `O(1)` average | `set.delete(3)` | remove a value |
| Set | `clear` | `set.clear()` | `O(n)` | `set.clear()` | reset everything |

## 5. WeakMap and WeakSet

| Type | Best for | Limitation | Interview note |
| --- | --- | --- | --- |
| `WeakMap` | object metadata and private-ish data | keys must be objects | entries can be garbage-collected |
| `WeakSet` | tracking objects you have seen | values must be objects | no size or iteration |

## 6. When to use it

- use `Map` when keys are not simple object properties or when insertion order matters
- use `Set` when you only need uniqueness or fast membership checks
- use `WeakMap` and `WeakSet` for memory-sensitive object tracking

## 7. Interview examples

- count frequencies with a `Map`
- remove duplicates with a `Set`
- mark visited nodes with a `Set`
- cache computed object metadata with a `WeakMap`

## 8. Common mistakes

- using a plain object when a `Map` is safer for arbitrary keys
- forgetting that `Set` stores unique values only
- trying to iterate over `WeakMap` or `WeakSet`
- assuming object property order is a lookup structure

## 9. Interview notes

- know average `O(1)` lookup behavior
- explain why `Map` is better than `{}` in some cases
- explain why `Set` is useful for deduplication
- mention weak collections when memory matters

## 10. Exercises

### Beginner exercises

- create a `Map` and read a value
- deduplicate an array with `Set`
- check whether a value exists in a set

### Intermediate exercises

- count frequencies with a `Map`
- compare `Map` and object lookups
- explain why weak collections are not iterable

### Advanced exercises

- use a `Set` in a graph or tree traversal
- build a cache with `WeakMap`
- choose between object, `Map`, and `Set` for a data model

### Recommended LeetCode problems

- Two Sum
- Contains Duplicate
- Top K Frequent Elements

### Recommended HackerRank problems

- frequency counting exercises
- unique value filtering practice
