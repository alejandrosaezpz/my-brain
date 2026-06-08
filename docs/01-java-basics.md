# Java Basics

## 1. What it is

Java Basics is the core language layer you use before any algorithm problem: classes, methods, loops, conditionals, arrays, Strings, and the standard library.

## 2. What it is used for

- writing clean method-based solutions
- organizing interview code quickly
- using built-in utilities without overthinking them
- reading and explaining Java syntax clearly

## 3. How to initialize it in Java

Use a class, a `main` method, constructors, and standard objects.

```java
public class Example {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
    }
}
```

## 4. Main methods and operations

| Method / operation | What it does | Return value | Example |
| --- | --- | --- | --- |
| `main(String[] args)` | Program entry point | `void` | `public static void main(String[] args)` |
| `if / else` | Branches logic | no value | `if (x > 0) {}` |
| `for` / `while` | Repeats work | no value | `for (int i = 0; i < n; i++)` |
| `StringBuilder.append` | Builds strings efficiently | same builder | `builder.append("a")` |
| `Arrays.toString` | Prints arrays for debugging | `String` | `Arrays.toString(nums)` |
| `ArrayList.add` | Appends to a list | `boolean` | `list.add(value)` |

## 5. Basic examples

```java
int sum = 0;
for (int value : numbers) {
    sum += value;
}
```

## 6. How to iterate or use it

- use `for-each` for simple traversal
- use indexed loops when position matters
- use `StringBuilder` for repeated concatenation
- use standard library helpers when they reduce noise

## 7. Time and space complexity

| Operation | Time complexity | Space complexity | Notes |
| --- | --- | --- | --- |
| Loop through an array | `O(n)` | `O(1)` | single pass |
| Build a string with `StringBuilder` | amortized `O(n)` | `O(n)` | efficient for repeated appends |
| Array access by index | `O(1)` | `O(1)` | direct lookup |
| Sort with `Arrays.sort` | `O(n log n)` | varies | depends on input type |

## 8. Common mistakes

- forgetting boundary checks
- using `String` concatenation in loops
- mixing up value comparison and reference comparison
- forgetting that arrays are zero-indexed

## 9. When to use it in interviews

Use Java Basics to show that your code is readable, correct, and easy to follow. Clean syntax matters when you need to explain your thinking quickly.

## 10. Common interview patterns

- input validation
- loop-based accumulation
- helper methods
- building outputs incrementally

## 11. Recommended exercises

| Problem name | Platform | Difficulty | Pattern | Implementation status |
| --- | --- | --- | --- | --- |
| Utility method warmups | Custom | Easy | syntax practice | TODO |
| StringBuilder practice | Custom | Easy | string building | TODO |

## 12. Quick checklist

- [ ] know the main syntax pieces
- [ ] use `StringBuilder` when needed
- [ ] prefer clear loops over clever code
- [ ] keep helpers small
