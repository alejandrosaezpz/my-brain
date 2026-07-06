# ES6+

## 1. What it is

ES6+ means the modern JavaScript features added since ES2015.

## 2. What it is used for

- cleaner syntax
- safer data access
- modular code organization
- shorter interview solutions

## 3. Main features

| Feature | Syntax | Example | Common mistake | Interview note |
| --- | --- | --- | --- | --- |
| Modules | file-based code organization | `export`, `import` | mixing CommonJS and ESM without knowing the difference | know the module system you are using |
| `import` | brings values into a file | `import { sum } from "./math.js";` | wrong path or missing export | used in modern frontend and Node.js |
| `export` | exposes a value | `export function sum() {}` | forgetting named exports are referenced by name | common for utilities |
| default export | one primary export per file | `export default function App() {}` | importing the default with braces | know the syntax difference |
| Destructuring | unpack arrays or objects | `const { name } = user;` | renaming incorrectly | used everywhere in modern JS |
| Spread | expand values | `const copy = [...arr];` | assuming deep copy | good for copying and merging |
| Rest | collect remaining values | `function f(...args) {}` | confusing with spread | useful in parameters |
| Optional chaining | safe nested access | `user?.profile?.name` | hiding missing data too early | reduces guard code |
| Nullish coalescing | default for null/undefined | `value ?? "fallback"` | using `||` when `0` is valid | know the difference |

## 4. Example

```javascript
export function sum(a, b) {
  return a + b;
}

const user = { profile: { name: "Ana" } };
const label = user?.profile?.name ?? "guest";
```

## 5. Common mistakes

- importing the default export with braces
- expecting spread to deep copy nested objects
- using `||` when `??` is the better fallback
- forgetting module paths and file extensions when required

## 6. Interview notes

- know named export vs default export
- know when destructuring makes code cleaner
- mention that modern syntax improves readability but should stay clear

## 7. Exercises

### Beginner exercises

- destructure one object and one array
- copy an array with spread
- use optional chaining in a property lookup

### Intermediate exercises

- write a named export and import it elsewhere
- write a default export and import it correctly
- explain spread vs rest

### Advanced exercises

- compare `??` and `||` with real values
- explain why spread is shallow
- describe the module system you would use in a frontend project

### Recommended LeetCode problems

- module-friendly utility practice
- modern syntax warm-ups

### Recommended HackerRank problems

- ES6 syntax exercises
- import/export practice tasks
