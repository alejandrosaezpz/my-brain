# Java Interview Prep

Java 21 interview practice repo with focused theory, original explanations, reusable templates, and curated starter problems.

Phase 1 includes fully written docs for topics 01-07 and 17 starter problems across arrays, strings, hash maps/sets, collections, and stack/queue practice.

## Badges

![Java 21](https://img.shields.io/badge/Java-21-blue?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?logo=apachemaven)
![JUnit 5](https://img.shields.io/badge/JUnit%205-5.11.0-25A162?logo=junit5)
![GitHub Actions](https://img.shields.io/badge/GitHub%20Actions-Java%20Tests-2088FF?logo=githubactions&logoColor=white)
![Status](https://img.shields.io/badge/status-foundation%20ready-brightgreen)

## Table of contents

- [What this repository is](#what-this-repository-is)
- [Who this repository is for](#who-this-repository-is-for)
- [How to use it](#how-to-use-it)
- [How to run tests](#how-to-run-tests)
- [Study methodology](#study-methodology)
- [Roadmap](#roadmap)
- [Repository status](#repository-status)
- [Recommended platforms](#recommended-platforms)
- [External problem statements](#external-problem-statements)
- [Example folder structure](#example-folder-structure)
- [Next steps](#next-steps)

## What this repository is

A clean study repository for interview prep in Java.

It combines:

- technical Java documentation
- data structures and algorithms theory
- interview patterns
- original problem summaries
- Java solutions
- JUnit 5 tests
- a consistent GitHub-friendly writing style

## Who this repository is for

- beginners preparing for coding interviews
- students reviewing Java and DSA fundamentals
- developers who want a structured practice path
- anyone who prefers short, practical explanations over long theory dumps

## How to use it

1. Read a topic doc.
2. Review the related complexity notes.
3. Study the matching problem writeups.
4. Open the Java solution and tests.
5. Re-implement the solution yourself.
6. Run `mvn test`.
7. Review edge cases and complexity.

## How to run tests

```bash
mvn test
```

## Study methodology

1. Learn the technical concept.
2. Review Java syntax and methods.
3. Understand when to use it in interviews.
4. Practice selected problems.
5. Run JUnit tests.
6. Review complexity and edge cases.

## Roadmap

| # | Topic | Focus | Status |
| --- | --- | --- | --- |
| 01 | Java Basics | Java syntax, classes, loops, collections | ✅ docs ready |
| 02 | Big O | Time and space analysis | ✅ docs ready |
| 03 | Arrays | Core array patterns | ✅ docs + starter problems |
| 04 | Strings | String scanning and manipulation | ✅ docs + starter problems |
| 05 | HashMap & HashSet | Frequency maps and lookup patterns | ✅ docs + starter problems |
| 06 | ArrayList & Java Collections | List operations and utility classes | ✅ docs + starter problems |
| 07 | Stack, Queue & Deque | LIFO/FIFO and monotonic-style thinking | ✅ docs + starter problems |
| 08 | Sorting | Comparison and non-comparison sorting | 🟡 template ready |
| 09 | Two Pointers | Paired traversal patterns | 🟡 template ready |
| 10 | Sliding Window | Subarray and substring windows | 🟡 template ready |
| 11 | Prefix Sum | Range sum and transforms | 🟡 template ready |
| 12 | Binary Search | Search on sorted or monotonic space | 🟡 template ready |
| 13 | Recursion | Base cases and decomposition | 🟡 template ready |
| 14 | Linked List | Pointer manipulation | 🟡 template ready |
| 15 | Trees | DFS, BFS, and tree recursion | 🟡 template ready |
| 16 | Heap & PriorityQueue | Top-k and scheduling patterns | 🟡 template ready |
| 17 | Graphs | Traversal, connectivity, and search | 🟡 template ready |
| 18 | Backtracking | Search with pruning | 🟡 template ready |
| 19 | Dynamic Programming | Reuse subproblems | 🟡 template ready |
| 20 | Bit Manipulation | Bitwise reasoning | 🟡 template ready |
| 21 | Greedy | Local decisions with proof ideas | 🟡 template ready |
| 22 | Mock Assessments | Mixed practice and review | 🟡 template ready |

## Repository status

| Topic | Documentation status | Problems status | Tests status | Difficulty |
| --- | --- | --- | --- | --- |
| Java Basics | Complete | Not started | N/A | Beginner |
| Big O | Complete | N/A | N/A | Beginner |
| Arrays | Complete | Complete (5) | Complete | Easy |
| Strings | Complete | Complete (4) | Complete | Easy |
| HashMap & HashSet | Complete | Complete (4) | Complete | Easy-Medium |
| ArrayList & Java Collections | Complete | Complete (2) | Complete | Easy-Medium |
| Stack, Queue & Deque | Complete | Complete (2) | Complete | Easy-Medium |
| Sorting | Template only | Not started | Not started | Easy-Medium |
| Two Pointers | Template only | Not started | Not started | Easy-Medium |
| Sliding Window | Template only | Not started | Not started | Medium |
| Prefix Sum | Template only | Not started | Not started | Easy-Medium |
| Binary Search | Template only | Not started | Not started | Medium |
| Recursion | Template only | Not started | Not started | Medium |
| Linked List | Template only | Not started | Not started | Medium |
| Trees | Template only | Not started | Not started | Medium |
| Heap & PriorityQueue | Template only | Not started | Not started | Medium |
| Graphs | Template only | Not started | Not started | Medium-Hard |
| Backtracking | Template only | Not started | Not started | Medium-Hard |
| Dynamic Programming | Template only | Not started | Not started | Hard |
| Bit Manipulation | Template only | Not started | Not started | Medium |
| Greedy | Template only | Not started | Not started | Medium |
| Mock Assessments | Template only | Not started | Not started | Mixed |

## Recommended platforms

- LeetCode
- NeetCode
- CodeSignal
- HackerRank
- Codewars

## External problem statements

Do **not** copy full problem statements from LeetCode, CodeSignal, or similar platforms.

This repository uses:

- short original summaries
- original explanations
- original test cases and notes
- concise references to the source platform only when helpful

## Example folder structure

```text
README.md
roadmap.md
SPEC.md
STYLE_GUIDE.md
CONTRIBUTING.md
complexity-cheatsheet.md

templates/
  DOC_TEMPLATE.md
  PROBLEM_TEMPLATE.md

docs/
  01-java-basics.md
  02-big-o.md
  03-arrays.md
  ...

problems/
  leetcode/
    arrays/
    strings/
    hashmap-hashset/
  codesignal-style/
    arrays/
    strings/
    matrices/
  custom/
    java-basics/
    data-structures/

src/main/java/
  arrays/
  strings/
  hashmaphashset/
  collections/
  stackqueue/

src/test/java/
  arrays/
  strings/
  hashmaphashset/
  collections/
  stackqueue/
```

## Next steps

- add the remaining topic docs
- expand each topic with more problems
- add review checkpoints and timed mock sets
- continue improving test coverage and explanations
