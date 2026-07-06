# Objects

## 1. What it is

Objects store keyed data as property-value pairs.

## 2. What it is used for

- representing records
- grouping related data
- building lookup tables
- modeling nested structures

## 3. Creation and access

```javascript
const user = { name: "Ana", age: 30 };
const city = user.address?.city;
user.country = "ES";
```

## 4. Property access

| Operation | Syntax | Example | Interview note |
| --- | --- | --- | --- |
| Dot access | `obj.key` | `user.name` | best for known keys |
| Bracket access | `obj[key]` | `user[fieldName]` | needed for dynamic keys |
| Add/update | `obj[key] = value` | `user.age = 31` | creates or overwrites |
| Delete | `delete obj[key]` | `delete user.age` | use carefully; may affect shape |

## 5. Object utility methods

| Method | What it does | Complexity | Example | Interview use case |
| --- | --- | --- | --- | --- |
| `Object.keys` | returns property names | `O(n)` | `Object.keys(user)` | iterate keys |
| `Object.values` | returns property values | `O(n)` | `Object.values(user)` | inspect values |
| `Object.entries` | returns key-value pairs | `O(n)` | `Object.entries(user)` | convert to arrays |
| `Object.assign` | copies properties into target | `O(n)` | `Object.assign({}, user)` | shallow copy / merge |
| `Object.freeze` | makes object immutable at the top level | `O(n)` | `Object.freeze(user)` | prevent accidental writes |
| `Object.seal` | prevents adding/removing properties | `O(n)` | `Object.seal(user)` | keep shape stable |

## 6. Shallow vs deep copy

| Copy type | What it copies | Example | Interview note |
| --- | --- | --- | --- |
| Shallow copy | copies top-level properties only | `{ ...obj }`, `Object.assign({}, obj)` | nested objects still share references |
| Deep copy | copies nested structures too | `structuredClone(obj)` | use when nested data must be isolated |

```javascript
const original = { name: "Ana", meta: { active: true } };
const copy = { ...original };
copy.meta.active = false;
// original.meta.active also changes because the copy is shallow
```

## 7. Common mistakes

- forgetting that object copies are often shallow
- using dot access when the key is dynamic
- expecting `freeze` to deep-freeze nested objects
- deleting properties in performance-sensitive code

## 8. Interview notes

- explain when to use objects vs `Map`
- know how to access dynamic properties
- understand shallow copy and deep copy
- know that object keys are usually strings or symbols

## 9. Exercises

### Beginner exercises

- create an object and read two properties
- add a dynamic property using bracket syntax
- list object keys with `Object.keys`

### Intermediate exercises

- copy an object with spread syntax
- compare `Object.keys` and `Object.entries`
- explain the difference between `freeze` and `seal`

### Advanced exercises

- show why a shallow copy is not enough for nested data
- build a function that merges two objects
- compare objects and `Map` for lookup data

### Recommended LeetCode problems

- Two Sum
- Group Anagrams
- Top K Frequent Elements

### Recommended HackerRank problems

- object and dictionary exercises
- merge and transform records practice
