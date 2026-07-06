# Functions

## 1. What it is

Functions are reusable blocks of logic that can take inputs and return outputs.

## 2. What it is used for

- organizing code into small units
- reusing logic
- passing behavior as values
- solving interview problems cleanly

## 3. Main function forms

| Form | Syntax | Example | Common mistake | Interview note |
| --- | --- | --- | --- | --- |
| Declaration | `function name() {}` | `function add(a, b) { return a + b; }` | forgetting declarations are hoisted | easiest to read |
| Expression | `const fn = function() {}` | `const add = function(a, b) { return a + b; };` | trying to call before initialization | useful for callbacks |
| Arrow function | `const fn = () => {}` | `const add = (a, b) => a + b;` | using it as a method that needs `this` | common in modern code |
| Callback | `fn(otherFn)` | `setTimeout(() => {}, 1000)` | losing track of nested control flow | very common in JS APIs |
| Higher-order function | returns or accepts a function | `nums.map(x => x * 2)` | overcomplicating simple logic | shows comfort with abstractions |
| Recursion | function calls itself | `factorial(n)` | forgetting the base case | good for trees and divide-and-conquer |
| Closure | inner function keeps outer state | `makeCounter()` | expecting outer state to disappear | key JavaScript concept |

## 4. Example

```javascript
function makeCounter() {
  let count = 0;
  return function () {
    count += 1;
    return count;
  };
}

const next = makeCounter();
next();
next();
```

## 5. How to use it

- use declarations for general-purpose helpers
- use expressions and arrows for callbacks and inline logic
- use recursion only when it makes the problem simpler
- use closures to preserve state between calls

## 6. Common mistakes

- forgetting the base case in recursion
- using arrow functions when `this` should be dynamic
- nesting too many callbacks
- returning the wrong value or no value at all

## 7. Interview notes

- know the difference between declarations and expressions
- explain why arrow functions capture `this` lexically
- mention closures when state must be preserved
- show you can choose recursion only when it fits naturally

## 8. Exercises

### Beginner exercises

- write a function declaration that adds two numbers
- write an arrow function that doubles a number
- pass a function into `map`

### Intermediate exercises

- implement a counter with a closure
- write a recursive factorial function
- explain why a callback is a function argument

### Advanced exercises

- compare function declaration, expression, and arrow syntax
- build a small higher-order function
- explain how closures help in interview code

### Recommended LeetCode problems

- Two Sum
- Reverse String
- Climbing Stairs

### Recommended HackerRank problems

- function syntax warm-ups
- recursion practice
