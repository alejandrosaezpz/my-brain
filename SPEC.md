# Project specification

## Purpose

Create a clean personal knowledge base that combines language notes, problem patterns, original explanations, Java solutions, JUnit 5 tests, and docs-only JavaScript reference pages.

## Topic list

The repository has 22 core Java topics inside `Languages/Java` and a docs-only JavaScript section inside `Languages/JavaScript`:

1. Java Basics
2. Big O
3. Arrays
4. Strings
5. HashMap & HashSet
6. ArrayList & Java Collections
7. Stack, Queue & Deque
8. Sorting
9. Two Pointers
10. Sliding Window
11. Prefix Sum
12. Binary Search
13. Recursion
14. Linked List
15. Trees
16. Heap & PriorityQueue
17. Graphs
18. Backtracking
19. Dynamic Programming
20. Bit Manipulation
21. Greedy
22. Mock Assessments

## Supplemental reference pages

These pages sit alongside the 22 core topics and are not counted as topics:

- Interview Patterns
- Java Interview Cheat Sheet
- Complexity Cheat Sheet

## JavaScript docs section

The JavaScript section is documentation-only for now and follows the same concise, interview-oriented style:

- Introduction
- Syntax & Fundamentals
- Arrays
- Objects
- Strings
- Map & Set
- Functions
- Asynchronous JavaScript
- DOM
- JSON
- Error Handling
- ES6+
- JavaScript Interview Cheat Sheet
- JavaScript Interview Patterns
- JavaScript Coding Assessments
- Frontend Foundations
- JavaScript vs Java

## Folder structure rules

- Keep Markdown docs in `docs/` using numbered filenames, grouped under section folders.
- Use `index.md` landing pages at each section root.
- Keep reusable templates in `templates/`.
- Keep problem explanations in `problems/` by platform and topic.
- Keep Java solutions in `src/main/java/` using lowercase package names.
- Keep JUnit tests in `src/test/java/` mirroring the main package structure.
- Keep CI in `.github/workflows/`.

## Documentation rules

- Every topic documentation file should follow the same structure within a section.
- Reference pages may use a lighter structure, but they should still stay concise and easy to scan.
- Write short, original explanations.
- Start with the technical idea before showing Java.
- Include a table for methods or operations when relevant.
- Include time and space complexity.
- Include common mistakes and interview usage.
- Keep paragraphs short and easy to scan.

## Problem explanation rules

- Every problem must have:
  - a Java solution
  - a JUnit test
  - a Markdown explanation
- Do not copy full problem statements from external platforms.
- Write a short original summary instead.
- State the platform only as a reference.
- Include intuition, step-by-step approach, complexity, and edge cases.
- Keep the explanation practical and concise.

## Java code rules

- Use Java 21.
- Prefer readable Java over clever Java.
- Use meaningful class and method names.
- Use simple, interview-friendly methods.
- Avoid overengineering.
- Use comments only when they add clarity.
- Prefer standard library collections when possible.
- Handle edge cases explicitly.

## JUnit test rules

- Use JUnit 5.
- Cover normal cases.
- Cover edge cases.
- Cover empty input when valid.
- Cover single-element input when valid.
- Cover duplicates where relevant.
- Cover negative numbers where relevant.
- Keep tests readable and descriptive.

## Naming conventions

- Packages: lowercase, no hyphens.
  - `arrays`
  - `strings`
  - `hashmaphashset`
  - `collections`
  - `stackqueue`
- Classes: PascalCase.
  - `TwoSum`
  - `ValidParentheses`
  - `DynamicArray`
- Tests: `ClassNameTest`.
- Markdown filenames: lowercase with hyphens.

## Markdown formatting rules

- Use GitHub-flavored Markdown.
- Use clear headings.
- Keep paragraphs short.
- Use tables when they help scanning.
- Use code blocks for Java examples.
- Use checklists for review steps.
- Use badges consistently in the README.
- Avoid long walls of text.

## External platform citation rules

- You may mention LeetCode, CodeSignal, NeetCode, HackerRank, or Codewars as source platforms.
- Use only a short reference line in the problem file.
- Do not reproduce the original statement verbatim.
- Do not copy platform-specific editorial text.
- Use your own summary, explanation, and examples.

## What should be copied

- the general problem idea
- the platform name
- your own original summary
- your own solution and tests
- your own complexity notes

## What should not be copied

- full external statements
- examples that are clearly taken verbatim from the platform
- editorial explanations
- diagrams or text that are platform-specific without permission

## Quality checklist before opening a pull request

- [ ] topic doc follows the standard structure
- [ ] problem explanation has summary, intuition, steps, complexity, edge cases
- [ ] Java solution compiles
- [ ] JUnit tests pass
- [ ] package and class names are consistent
- [ ] README and roadmap are updated
- [ ] Markdown links render correctly
- [ ] no copied external statement text
- [ ] code is readable and interview-friendly
