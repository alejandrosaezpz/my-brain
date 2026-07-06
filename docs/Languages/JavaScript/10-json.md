# JSON

## 1. What it is

JSON is a text format for structured data exchange.

## 2. What it is used for

- API requests and responses
- storing lightweight data
- sending data between systems

## 3. Main methods

| Method | Syntax | What it does | Example |
| --- | --- | --- | --- |
| `JSON.parse` | `JSON.parse(text)` | converts JSON text into a JavaScript value | `JSON.parse('{"a":1}')` |
| `JSON.stringify` | `JSON.stringify(value)` | converts a JavaScript value into JSON text | `JSON.stringify({ a: 1 })` |

## 4. Example

```javascript
const text = '{"name":"Ana","active":true}';
const obj = JSON.parse(text);
const backToText = JSON.stringify(obj);
```

## 5. Common mistakes

- forgetting that JSON uses double quotes
- trying to stringify values with circular references
- expecting functions or `undefined` to survive serialization
- parsing non-JSON text without validation

## 6. Interview notes

- know that JSON is a string format, not a JavaScript object
- explain when to parse and when to stringify
- know that API responses often arrive as text first

## 7. Exercises

### Beginner exercises

- parse a JSON string into an object
- stringify an object back to text
- explain the difference between JSON and a JavaScript object

### Intermediate exercises

- safely access a parsed JSON field
- handle a parse failure with `try/catch`
- serialize an array of objects

### Advanced exercises

- explain why circular objects break `JSON.stringify`
- compare JSON with `Map` and `Set`
- parse API data and transform it for display

### Recommended LeetCode problems

- JSON parsing warm-ups
- object serialization practice tasks

### Recommended HackerRank problems

- JSON conversion exercises
- API response parsing tasks
