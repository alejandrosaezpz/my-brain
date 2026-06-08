# Group Anagrams

## Platform

LeetCode

## Difficulty

Medium

## Pattern

Grouping by canonical key

## Problem summary

Group words that are anagrams of each other.

## What this problem teaches

How to build buckets from a normalized key.

## Intuition

Words that share the same sorted character signature belong together.

## Step-by-step approach

1. Sort each word to create a key.
2. Store words in a map keyed by that signature.
3. Return the grouped values.

## Java solution

```java
public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> groups = new HashMap<>();
    for (String word : strs) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        String key = new String(letters);
        groups.computeIfAbsent(key, ignored -> new ArrayList<>()).add(word);
    }
    return new ArrayList<>(groups.values());
}
```

## Complexity

- Time complexity: `O(n * k log k)`
- Space complexity: `O(n * k)`

## Edge cases

- empty input
- single word
- repeated identical words

## Tests

- multiple anagram groups
- empty input

## Related problems

- Valid Anagram
- Top K Frequent Elements
