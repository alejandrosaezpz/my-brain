# Frontend Foundations

## 1. What it is

The basic browser-side concepts every JavaScript developer should understand.

## 2. What it is used for

- understanding how a page becomes interactive
- reasoning about UI updates
- writing code that fits the browser model
- speaking clearly in frontend interviews

## 3. Core concepts

| Concept | What it means | Interview note |
| --- | --- | --- |
| Browser rendering | HTML, CSS, and JavaScript become pixels on screen | know that rendering is not just JavaScript execution |
| HTML interaction | JavaScript reads and updates elements | DOM selection and updates matter |
| CSS interaction | JavaScript toggles classes and styles | prefer class changes over inline styles when possible |
| DOM lifecycle | the document becomes available over time | know when to run code after the DOM is ready |
| Events | user actions and browser signals | know bubbling and delegation |
| State | current data shown in the UI | keep state minimal and predictable |
| Components | reusable UI pieces, framework-independent | think in composition, not framework syntax |
| APIs | services the browser or server exposes | `fetch`, storage, geolocation, etc. |
| HTTP requests | sending and receiving data over the network | know request, response, status, and headers |

## 4. Basic flow

1. Load HTML.
2. Apply CSS.
3. Run JavaScript.
4. React to events.
5. Update state.
6. Re-render the UI.

## 5. Common mistakes

- mixing up DOM updates with CSS styling
- running DOM code before the document is ready
- storing too much derived state
- ignoring network latency and loading states

## 6. Interview notes

- explain how browser rendering and the DOM relate
- know why event delegation is useful
- know what state means in a plain JavaScript app
- be able to describe a basic HTTP request flow

## 7. Exercises

### Beginner exercises

- describe the browser rendering pipeline in one minute
- explain what the DOM is
- list two ways JavaScript updates the UI

### Intermediate exercises

- explain event delegation
- describe why classes are often better than inline styles
- outline a fetch request from the browser

### Advanced exercises

- compare DOM state and application state
- explain when to wait for the DOM lifecycle
- describe how JavaScript and CSS work together

### Recommended LeetCode problems

- UI state simulation warm-ups
- browser behavior practice tasks

### Recommended HackerRank problems

- frontend foundations practice sets
- browser interaction tasks
