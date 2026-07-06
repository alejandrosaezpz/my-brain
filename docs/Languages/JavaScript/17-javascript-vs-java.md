# JavaScript vs Java

## 1. What it is

A comparison page for Java developers learning JavaScript.

## 2. Main differences and similarities

| Area | Java | JavaScript | Useful takeaway |
| --- | --- | --- | --- |
| Variables | typed local variables | `var`, `let`, `const` with dynamic values | JavaScript is more flexible but easier to misuse |
| Types | static, explicit types | dynamic, runtime types | check values carefully in JavaScript |
| Arrays | fixed-type containers | flexible lists of any values | JS arrays behave more like dynamic lists |
| Objects | classes and instances | plain objects and prototypes | objects are used more broadly in JS |
| Classes | central OOP feature | syntax over prototypes | the syntax looks familiar but the model differs |
| Functions | methods and lambdas | first-class functions | functions are values in JavaScript |
| Collections | `List`, `Map`, `Set` | arrays, `Map`, `Set`, objects | choose the right structure for the job |
| Async | threads, futures, executors | event loop, promises, `async/await` | JS async is event-loop based |
| Memory model | JVM-managed objects and GC | engine-managed objects and GC | both use garbage collection, but the runtime differs |

## 3. Similarities worth remembering

- both use garbage collection
- both support object-oriented style code
- both rely on standard libraries for common tasks
- both benefit from readable, small functions

## 4. Common Java-to-JS mistakes

- expecting strict static typing
- looking for overloaded methods everywhere
- treating arrays like Java arrays only
- forgetting that functions are values
- assuming async means threads

## 5. Interview notes

- explain the type system difference first
- compare collections with arrays, objects, `Map`, and `Set`
- know the async difference between futures and promises
- mention that classes exist, but JavaScript is not Java

## 6. Exercises

### Beginner exercises

- compare `let` and Java local variables
- compare a JS array with a Java `List`
- explain `Map` in both languages

### Intermediate exercises

- compare Java lambdas with JS functions
- compare Java futures with JS promises
- explain why JavaScript objects are not Java POJOs

### Advanced exercises

- describe the memory model difference at a high level
- compare class syntax in both languages
- explain how `async/await` changes JavaScript flow

### Recommended LeetCode problems

- Two Sum
- Valid Anagram
- Group Anagrams

### Recommended HackerRank problems

- Java-to-JavaScript translation exercises
- collections and async comparison tasks
