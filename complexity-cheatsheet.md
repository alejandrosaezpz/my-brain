# Big O cheat sheet

## Common complexities

| Complexity | Example idea | Java example |
| --- | --- | --- |
| `O(1)` | constant-time lookup | `map.get(key)` |
| `O(log n)` | halve the search space | binary search |
| `O(n)` | one full pass | loop through an array |
| `O(n log n)` | efficient sorting | `Arrays.sort(nums)` |
| `O(n^2)` | nested loops | compare every pair |
| `O(2^n)` | all subsets | backtracking subsets |
| `O(n!)` | all permutations | permutation generation |

## Examples in Java

- `arr[i]` is `O(1)`
- `HashMap.get` is average `O(1)`
- `HashSet.contains` is average `O(1)`
- `ArrayList.add(value)` at the end is amortized `O(1)`
- `LinkedList.get(i)` is `O(n)`

## Array operations

| Operation | Time | Space | Notes |
| --- | --- | --- | --- |
| Index access | `O(1)` | `O(1)` | direct lookup |
| Update by index | `O(1)` | `O(1)` | direct write |
| Traverse | `O(n)` | `O(1)` | one pass |
| Insert/delete in middle | `O(n)` | `O(1)` | elements shift |
| Sort | `O(n log n)` | varies | depends on implementation |

## HashMap operations

| Operation | Time | Space | Notes |
| --- | --- | --- | --- |
| `put` | average `O(1)` | `O(n)` | hash table lookup |
| `get` | average `O(1)` | `O(n)` | average case |
| `containsKey` | average `O(1)` | `O(n)` | lookup by key |
| `remove` | average `O(1)` | `O(n)` | may trigger rehashing |

## HashSet operations

| Operation | Time | Space | Notes |
| --- | --- | --- | --- |
| `add` | average `O(1)` | `O(n)` | uniqueness enforced |
| `contains` | average `O(1)` | `O(n)` | common interview use |
| `remove` | average `O(1)` | `O(n)` | average case |

## ArrayList operations

| Operation | Time | Space | Notes |
| --- | --- | --- | --- |
| `add` at end | amortized `O(1)` | `O(n)` | occasional resize |
| `get` | `O(1)` | `O(1)` | indexed access |
| `set` | `O(1)` | `O(1)` | overwrite value |
| `remove` at index | `O(n)` | `O(1)` | shifting required |

## LinkedList operations

| Operation | Time | Space | Notes |
| --- | --- | --- | --- |
| insert at head | `O(1)` | `O(1)` | pointer update |
| remove at head | `O(1)` | `O(1)` | pointer update |
| search by index | `O(n)` | `O(1)` | must traverse |
| insert/delete in middle | `O(n)` | `O(1)` | find position first |

## Stack / Queue operations

| Operation | Time | Space | Notes |
| --- | --- | --- | --- |
| `push` / `offer` | `O(1)` | `O(n)` | add to structure |
| `pop` / `poll` | `O(1)` | `O(n)` | remove from structure |
| `peek` | `O(1)` | `O(n)` | inspect next item |

## Sorting complexities

- `Arrays.sort(int[])` is typically `O(n log n)`
- comparison sort lower bound is `O(n log n)`
- counting-style sorts can be linear when constraints allow it

## Binary search complexity

- time: `O(log n)`
- space: `O(1)` for iterative version
- recursive versions use `O(log n)` stack space

## Recursion complexity basics

- time depends on the number of recursive calls
- space includes the call stack
- always identify the base case
- be careful with branching recursion such as subsets or permutations

## How to explain complexity in interviews

1. State the dominant operation.
2. Count the number of passes or recursive branches.
3. Explain average vs worst case if a hash structure is used.
4. Mention space used by extra data structures and the call stack.
5. Keep the explanation short and direct.
