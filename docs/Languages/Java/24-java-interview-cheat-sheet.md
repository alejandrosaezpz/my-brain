# Java Interview Cheat Sheet

## 1. What it is

A compact reference for the Java methods that show up most often in coding interviews.

## 2. What it is used for

- quick syntax checks
- faster solution writing
- reducing memory for common APIs

## 3. How to initialize it in Java

Import the relevant classes and call the static methods directly when possible.

## 4. Main methods and operations

### Arrays

| Method | Syntax | Short explanation | Example |
| --- | --- | --- | --- |
| `sort` | `Arrays.sort(arr);` | sorts an array in ascending order | `Arrays.sort(nums);` |
| `binarySearch` | `Arrays.binarySearch(arr, target);` | searches a sorted array | `int i = Arrays.binarySearch(nums, 7);` |
| `equals` | `Arrays.equals(a, b);` | compares two arrays by contents | `Arrays.equals(a, b);` |
| `fill` | `Arrays.fill(arr, value);` | fills every position with one value | `Arrays.fill(nums, 0);` |
| `copyOf` | `Arrays.copyOf(arr, newLength);` | copies into a new array | `int[] copy = Arrays.copyOf(nums, 5);` |

### Collections

| Method | Syntax | Short explanation | Example |
| --- | --- | --- | --- |
| `sort` | `Collections.sort(list);` | sorts a list in ascending order | `Collections.sort(list);` |
| `reverse` | `Collections.reverse(list);` | reverses the list in place | `Collections.reverse(list);` |
| `frequency` | `Collections.frequency(c, obj);` | counts occurrences in a collection | `int count = Collections.frequency(list, 2);` |
| `min` | `Collections.min(c);` | returns the smallest element | `int min = Collections.min(list);` |
| `max` | `Collections.max(c);` | returns the largest element | `int max = Collections.max(list);` |

### Math

| Method | Syntax | Short explanation | Example |
| --- | --- | --- | --- |
| `max` | `Math.max(a, b);` | returns the larger value | `int x = Math.max(a, b);` |
| `min` | `Math.min(a, b);` | returns the smaller value | `int x = Math.min(a, b);` |
| `abs` | `Math.abs(x);` | returns absolute value | `int d = Math.abs(-5);` |
| `pow` | `Math.pow(a, b);` | raises a number to a power | `double p = Math.pow(2, 10);` |

### Character

| Method | Syntax | Short explanation | Example |
| --- | --- | --- | --- |
| `isDigit` | `Character.isDigit(c);` | checks for a digit | `if (Character.isDigit(ch))` |
| `isLetter` | `Character.isLetter(c);` | checks for a letter | `if (Character.isLetter(ch))` |
| `isUpperCase` | `Character.isUpperCase(c);` | checks uppercase letters | `Character.isUpperCase(ch);` |
| `isLowerCase` | `Character.isLowerCase(c);` | checks lowercase letters | `Character.isLowerCase(ch);` |
| `toLowerCase` | `Character.toLowerCase(c);` | converts one char to lowercase | `char lower = Character.toLowerCase(ch);` |
| `toUpperCase` | `Character.toUpperCase(c);` | converts one char to uppercase | `char upper = Character.toUpperCase(ch);` |

### Integer

| Method | Syntax | Short explanation | Example |
| --- | --- | --- | --- |
| `parseInt` | `Integer.parseInt(text);` | converts a string to `int` | `int n = Integer.parseInt("42");` |
| `valueOf` | `Integer.valueOf(text);` | converts a string to `Integer` | `Integer n = Integer.valueOf("42");` |

### String

| Method | Syntax | Short explanation | Example |
| --- | --- | --- | --- |
| `substring` | `s.substring(start, end);` | returns a slice of the string | `s.substring(1, 4);` |
| `split` | `s.split(regex);` | splits by a regex delimiter | `s.split(",");` |
| `contains` | `s.contains(part);` | checks whether a substring exists | `s.contains("abc");` |
| `startsWith` | `s.startsWith(prefix);` | checks the start of the string | `s.startsWith("pre");` |
| `endsWith` | `s.endsWith(suffix);` | checks the end of the string | `s.endsWith("ing");` |
| `indexOf` | `s.indexOf(ch);` | finds first occurrence | `int i = s.indexOf('a');` |
| `replace` | `s.replace(old, new);` | replaces characters or substrings | `s.replace("a", "b");` |
| `trim` | `s.trim();` | removes leading and trailing spaces | `String t = s.trim();` |
| `equals` | `s.equals(other);` | compares string contents | `s.equals("hello");` |
| `equalsIgnoreCase` | `s.equalsIgnoreCase(other);` | compares without case sensitivity | `s.equalsIgnoreCase("Hello");` |

### StringBuilder

| Method | Syntax | Short explanation | Example |
| --- | --- | --- | --- |
| `append` | `sb.append(value);` | adds text to the end | `sb.append("abc");` |
| `insert` | `sb.insert(index, value);` | inserts text at a position | `sb.insert(0, "start");` |
| `deleteCharAt` | `sb.deleteCharAt(index);` | removes one character | `sb.deleteCharAt(2);` |
| `reverse` | `sb.reverse();` | reverses the builder contents | `sb.reverse();` |
| `toString` | `sb.toString();` | converts back to `String` | `String s = sb.toString();` |

## 5. Basic examples

```java
StringBuilder sb = new StringBuilder();
sb.append("abc").append(123);
String result = sb.toString();
```

## 6. How to iterate or use it

- prefer the static utility class when available
- use `StringBuilder` for repeated string concatenation
- use `Collections` for list-wide helpers
- use `Arrays` for array-wide helpers

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| `Arrays.sort` | `O(n log n)` | depends on type | primitives differ from objects |
| `Collections.sort` | `O(n log n)` | `O(n)` | stable list sort |
| `StringBuilder.append` | amortized `O(1)` | grows as needed | good for loops |

## 8. Common mistakes

- using `==` for strings instead of `.equals()`
- forgetting that `Arrays.binarySearch` requires sorted input
- using `String` concatenation in a loop
- mixing up `Character` and `String` methods

## 9. When to use it in interviews

Use these methods when you want clean, readable Java with minimal boilerplate.

## 10. Common interview patterns

- array preprocessing
- string scanning
- collection counting
- mutable string building

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Valid Anagram | LeetCode | Easy | HashMap + String | TODO |
| Reverse String | LeetCode | Easy | StringBuilder / two pointers | TODO |
| Implement strStr() | LeetCode | Easy | String operations | TODO |

## 12. Quick checklist

- [ ] know the most common Java utility methods
- [ ] choose `StringBuilder` for repeated concatenation
- [ ] remember `equals` vs `==`
