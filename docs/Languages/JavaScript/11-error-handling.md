# Error Handling

## 1. What it is

Error handling is the process of detecting failures and responding cleanly.

## 2. What it is used for

- validating input
- handling runtime failures
- keeping apps from crashing silently
- making debugging easier

## 3. Main constructs

| Construct | Syntax | What it does | Example |
| --- | --- | --- | --- |
| `try` | `try { ... }` | runs code that may fail | `try { risky(); }` |
| `catch` | `catch (error) { ... }` | handles thrown errors | `catch (error) {}` |
| `finally` | `finally { ... }` | always runs after try/catch | `finally { cleanup(); }` |
| `throw` | `throw new Error(...)` | raises an error manually | `throw new Error("Bad input")` |

## 4. Custom errors

```javascript
class ValidationError extends Error {
  constructor(message) {
    super(message);
    this.name = "ValidationError";
  }
}
```

## 5. Example

```javascript
function parseAge(value) {
  const age = Number(value);
  if (Number.isNaN(age)) {
    throw new ValidationError("Age must be a number");
  }
  return age;
}
```

## 6. Common mistakes

- swallowing errors without logging or recovery
- throwing strings instead of `Error` objects
- forgetting `finally` for cleanup
- assuming `try/catch` catches asynchronous failures without `await`

## 7. Interview notes

- know when to throw vs when to return a fallback
- know how custom errors help distinguish failure types
- explain why `try/catch` matters around awaited code

## 8. Exercises

### Beginner exercises

- wrap risky code in `try/catch`
- throw an error for invalid input
- create a custom error class

### Intermediate exercises

- validate a function argument and fail early
- use `finally` to release a resource
- catch and log a parsing failure

### Advanced exercises

- design a small error hierarchy
- explain how async errors propagate with `await`
- compare throwing errors and returning status objects

### Recommended LeetCode problems

- validation and parsing warm-ups
- exception handling practice tasks

### Recommended HackerRank problems

- input validation exercises
- error-handling scenarios
