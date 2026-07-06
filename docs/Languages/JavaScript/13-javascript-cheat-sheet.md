# JavaScript Interview Cheat Sheet

## 1. Variables

```javascript
let count = 0;
const name = "Ana";
```

## 2. Loops

```javascript
for (let i = 0; i < arr.length; i++) {}
for (const item of arr) {}
while (condition) {}
```

## 3. Arrays

```javascript
arr.push(1);
arr.map(x => x * 2);
arr.filter(x => x > 0);
arr.reduce((sum, x) => sum + x, 0);
```

## 4. Objects

```javascript
const user = { name: "Ana" };
const name = user.name;
const city = user?.address?.city ?? "unknown";
```

## 5. Strings

```javascript
const text = " hello ".trim().toLowerCase();
text.includes("he");
text.split(" ");
```

## 6. Map and Set

```javascript
const map = new Map();
map.set("a", 1);

const set = new Set([1, 2, 2]);
set.has(2);
```

## 7. Functions

```javascript
function add(a, b) { return a + b; }
const double = n => n * 2;
```

## 8. map / filter / reduce

```javascript
const doubled = nums.map(n => n * 2);
const positives = nums.filter(n => n > 0);
const sum = nums.reduce((acc, n) => acc + n, 0);
```

## 9. Template literals

```javascript
const msg = `Hello ${name}`;
```

## 10. Destructuring

```javascript
const { id, title } = post;
const [first, second] = nums;
```

## 11. Async / await

```javascript
async function load() {
  const res = await fetch("/api/data");
  return await res.json();
}
```

## 12. Fetch and JSON

```javascript
const res = await fetch("/api/user");
const data = await res.json();
const text = JSON.stringify(data);
```

## 13. DOM

```javascript
const el = document.querySelector("#app");
el.textContent = "Ready";
el.classList.add("active");
```

## 14. Common interview reminders

- use `===`
- remember arrays are zero-indexed
- know what mutates and what returns a new value
- explain async flow clearly

## 15. Exercises

### Beginner exercises

- declare a variable with `let` and `const`
- write one `for...of` loop
- create one object and one array

### Intermediate exercises

- use `map`, `filter`, and `reduce` on the same array
- parse JSON and read one field
- select a DOM node and change its text

### Advanced exercises

- explain `??` vs `||` with examples
- use `fetch` with `async/await`
- compare `Map` with plain objects

### Recommended LeetCode problems

- Two Sum
- Valid Anagram
- Contains Duplicate

### Recommended HackerRank problems

- JavaScript quick syntax drills
- arrays, strings, and objects practice
