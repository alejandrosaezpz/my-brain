# Strings

## 1. What it is

Strings are immutable text values.

## 2. What it is used for

- parsing user input
- building formatted output
- searching and transforming text
- solving interview string problems

## 3. Common methods

| Method | Syntax | Complexity | Example | Common use case |
| --- | --- | --- | --- | --- |
| `split` | `str.split(separator)` | `O(n)` | `text.split(",")` | turn text into tokens |
| `substring` | `str.substring(start, end)` | `O(k)` | `text.substring(1, 4)` | extract a range |
| `slice` | `str.slice(start, end)` | `O(k)` | `text.slice(-3)` | extract with negative indexes |
| `replace` | `str.replace(search, value)` | `O(n)` | `text.replace("a", "b")` | replace first match |
| `replaceAll` | `str.replaceAll(search, value)` | `O(n)` | `text.replaceAll("-", "_")` | replace every match |
| `trim` | `str.trim()` | `O(n)` | `text.trim()` | remove outer spaces |
| `startsWith` | `str.startsWith(prefix)` | `O(k)` | `text.startsWith("pre")` | prefix check |
| `endsWith` | `str.endsWith(suffix)` | `O(k)` | `text.endsWith("ing")` | suffix check |
| `includes` | `str.includes(part)` | `O(n)` | `text.includes("abc")` | substring check |
| `indexOf` | `str.indexOf(part)` | `O(n)` | `text.indexOf("a")` | first match position |
| `lastIndexOf` | `str.lastIndexOf(part)` | `O(n)` | `text.lastIndexOf("a")` | last match position |
| `toUpperCase` | `str.toUpperCase()` | `O(n)` | `text.toUpperCase()` | normalize case |
| `toLowerCase` | `str.toLowerCase()` | `O(n)` | `text.toLowerCase()` | normalize case |

## 4. Basic example

```javascript
const cleaned = name.trim().toLowerCase();
const parts = cleaned.split(" ");
```

## 5. Common mistakes

- expecting strings to mutate in place
- confusing `slice` and `substring`
- forgetting that `replace` only changes the first match
- using `indexOf` when a boolean result is enough
- ignoring whitespace normalization

## 6. Interview notes

- know that strings are immutable
- know the difference between `includes`, `indexOf`, and `startsWith`
- know when `replaceAll` is needed
- mention complexity when scanning large strings

## 7. Exercises

### Beginner exercises

- trim a string and convert it to lowercase
- split a sentence into words
- check whether a string starts with a prefix

### Intermediate exercises

- count the number of times a substring appears
- replace every dash with an underscore
- compare `slice` and `substring`

### Advanced exercises

- solve a palindrome check with two pointers
- solve an anagram-style string problem
- normalize text before comparison

### Recommended LeetCode problems

- Valid Anagram
- Longest Common Prefix
- Valid Palindrome

### Recommended HackerRank problems

- string manipulation warm-ups
- case conversion and tokenization practice
