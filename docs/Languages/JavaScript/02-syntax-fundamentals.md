# Syntax & Fundamentals

## 1. What it is

Core JavaScript syntax for variables, types, operators, control flow, functions, scope, and modern expression features.

## 2. What it is used for

- writing correct interview solutions
- reading and explaining JavaScript quickly
- avoiding common language mistakes
- using modern syntax without guesswork

## 3. Main topics

| Topic | Explanation | Syntax | Example | Common mistake | Interview note |
| --- | --- | --- | --- | --- | --- |
| `var` | function-scoped, hoisted, legacy keyword | `var x = 1;` | `var count = 0;` | reusing it in new code | know its historical behavior |
| `let` | block-scoped, reassignable | `let x = 1;` | `let total = 0;` | using before declaration | preferred for changing values |
| `const` | block-scoped binding that cannot be reassigned | `const x = 1;` | `const name = "Ana";` | thinking objects become immutable | preferred by default |
| Primitive types | string, number, bigint, boolean, undefined, null, symbol | `typeof value` | `const ok = true;` | mixing `null` and `undefined` | know which values are primitive |
| Reference types | objects, arrays, functions | `const obj = {};` | `const list = [1, 2];` | comparing by contents with `===` | references are compared, not deep values |
| Operators | arithmetic, comparison, logical, assignment | `a + b`, `a === b` | `const same = a === b;` | using `==` by habit | strict equality is usually safest |
| Conditionals | branch code by condition | `if`, `else`, `switch`, `?:` | `if (x > 0) {}` | overusing nested conditions | show a clean branch structure |
| Loops | repeat work over collections or ranges | `for`, `while`, `for...of` | `for (const n of nums) {}` | using `for...in` on arrays | know when to use each loop |
| Functions | reusable blocks of code | `function name() {}` | `function sum(a, b) {}` | forgetting return values | core building block of JS |
| Arrow functions | short function syntax with lexical `this` | `const f = () => {}` | `const double = n => n * 2;` | using it where dynamic `this` is needed | common in callbacks |
| Scope | visibility rules for variables | global, function, block | `if (true) { let x = 1; }` | expecting block vars to leak | explain block scope vs function scope |
| Hoisting | declarations are available before execution in a limited way | `name(); function name() {}` | `console.log(x); var x = 1;` | assuming `let` and `const` behave the same | a common interview question |
| Closures | inner function remembers outer variables | `function outer() { return () => x; }` | `makeCounter()` | thinking outer values are copied | very important for callbacks and factories |
| Template literals | string interpolation with backticks | `` `Hi ${name}` `` | `` `Total: ${sum}` `` | using quotes instead of backticks | cleaner than concatenation |
| Destructuring | unpack arrays or objects into variables | `const {a} = obj;` | `const [first] = arr;` | renaming incorrectly | common in modern JS |
| Spread | expand an iterable or object | `...value` | `const copy = [...arr];` | assuming it deep-copies | usually shallow |
| Rest | collect remaining values | `(...args)` | `function f(...args) {}` | confusing it with spread | common in parameters |
| Optional chaining | safely access nested properties | `obj?.a?.b` | `user?.address?.city` | hiding missing-data bugs | reduces defensive boilerplate |
| Nullish coalescing | default only for `null` or `undefined` | `a ?? b` | `const name = input ?? "guest";` | using `||` when `0` or `""` are valid | know the difference from `||` |

## 4. Practical example

```javascript
const user = { name: "Ana", scores: [10, 20, 30] };
const { name, scores } = user;
const average = scores.reduce((sum, value) => sum + value, 0) / scores.length;
const label = `${name}: ${average}`;
```

## 5. Common mistakes

- using `==` instead of `===`
- expecting `const` to freeze object contents
- confusing spread and rest
- assuming `var` is block-scoped
- forgetting that closures keep access to outer variables

## 6. Interview notes

- explain `var`, `let`, and `const` clearly
- know primitive vs reference values
- be able to describe scope and hoisting
- mention closures when state is preserved between calls
- know when `??` is better than `||`

## 7. Exercises

### Beginner exercises

- rewrite a `var` example with `let` and `const`
- create one template literal string
- destructure an object and an array

### Intermediate exercises

- write a function that uses a rest parameter
- explain the difference between `??` and `||`
- show a closure that counts calls

### Advanced exercises

- explain hoisting with `var`, `let`, and `const`
- show why spread is shallow for objects
- compare `for...of` and `for...in`

### Recommended LeetCode problems

- Two Sum
- Contains Duplicate
- Valid Anagram

### Recommended HackerRank problems

- JavaScript variables and loops practice
- string interpolation and destructuring practice
