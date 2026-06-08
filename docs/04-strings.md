# Strings

## 1. What it is

Strings are immutable sequences of characters.

## 2. What it is used for

- text scanning
- pattern matching
- palindrome checks
- anagram and substring problems

## 3. How to initialize it in Java

```java
String s = "hello";
StringBuilder builder = new StringBuilder();
```

## 4. Main methods and operations

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| `length()` | Returns number of characters | `int` | `s.length()` |
| `charAt(i)` | Reads a character | `char` | `s.charAt(0)` |
| `substring(a, b)` | Extracts a slice | `String` | `s.substring(1, 3)` |
| `indexOf(x)` | Finds first match | `int` | `s.indexOf("a")` |
| `StringBuilder.append` | Efficiently builds text | same builder | `builder.append(c)` |

## 5. Basic examples

```java
StringBuilder builder = new StringBuilder();
for (char c : s.toCharArray()) {
    builder.append(c);
}
```

## 6. How to iterate or use it

- use two pointers for palindrome-style scans
- use frequency maps for anagrams
- use a sliding window for substrings
- use `StringBuilder` for rebuilding text

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| Read character | `O(1)` | `O(1)` | by index |
| Traverse | `O(n)` | `O(1)` | one pass |
| `substring` | `O(k)` | `O(k)` | k is slice length |
| Build with `StringBuilder` | amortized `O(n)` | `O(n)` | preferred over repeated `+` |

## 8. Common mistakes

- using `+` inside loops
- forgetting immutability
- not normalizing case before comparison
- ignoring punctuation when a problem asks you to ignore it

## 9. When to use it in interviews

Use strings for scanning, sanitizing, comparing, and window-based questions.

## 10. Common interview patterns

- two pointers
- frequency counting
- sliding window
- palindrome validation

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Valid Anagram | LeetCode | Easy | frequency map | implemented |
| Valid Palindrome | LeetCode | Easy | two pointers | implemented |
| First Unique Character in a String | LeetCode | Easy | counting | implemented |
| Longest Substring Without Repeating Characters | LeetCode | Medium | sliding window | implemented |

## 12. Quick checklist

- [ ] remember strings are immutable
- [ ] use `StringBuilder` for repeated concatenation
- [ ] normalize case when needed
- [ ] choose the right pointer or window pattern
