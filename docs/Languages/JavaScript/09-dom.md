# DOM

## 1. What it is

The DOM is the browser’s object model for HTML documents.

## 2. What it is used for

- reading and updating the page
- handling user interactions
- building dynamic interfaces
- responding to form input and clicks

## 3. Common methods

| Method | Syntax | What it does | Example |
| --- | --- | --- | --- |
| `querySelector` | `document.querySelector(selector)` | returns the first matching element | `document.querySelector(".card")` |
| `querySelectorAll` | `document.querySelectorAll(selector)` | returns all matching elements | `document.querySelectorAll("li")` |
| `getElementById` | `document.getElementById(id)` | returns one element by id | `document.getElementById("app")` |
| `createElement` | `document.createElement(tag)` | creates a new node | `document.createElement("div")` |
| `appendChild` | `parent.appendChild(node)` | adds a child node | `list.appendChild(item)` |
| `remove` | `element.remove()` | removes the node | `button.remove()` |
| `classList` | `element.classList` | manages CSS classes | `box.classList.add("active")` |
| `dataset` | `element.dataset` | reads data attributes | `row.dataset.id` |
| `innerHTML` | `element.innerHTML = html` | sets HTML content | `el.innerHTML = "<b>Hi</b>"` |
| `innerText` | `element.innerText` | visible rendered text | `el.innerText = "Hello"` |
| `textContent` | `element.textContent` | raw text content | `el.textContent = "Hello"` |

## 4. Events

| Event | Typical use | Example |
| --- | --- | --- |
| `click` | button and link interaction | `btn.addEventListener("click", fn)` |
| `submit` | form submission | `form.addEventListener("submit", fn)` |
| `input` | live text changes | `input.addEventListener("input", fn)` |
| `change` | committed value changes | `select.addEventListener("change", fn)` |

## 5. Bubbling and capturing

- **Capturing**: the event travels from the root down to the target.
- **Bubbling**: the event travels from the target back up to the root.
- Most listeners use bubbling by default.
- Event delegation uses bubbling to handle many children with one listener.

## 6. Example

```javascript
const list = document.querySelector("ul");

list.addEventListener("click", event => {
  if (event.target.matches("button.remove")) {
    event.target.closest("li").remove();
  }
});
```

## 7. Common mistakes

- using `innerHTML` when plain text is enough
- forgetting that `querySelectorAll` returns a NodeList
- attaching too many listeners instead of delegating
- confusing `innerText` and `textContent`

## 8. Interview notes

- know how to select, create, update, and remove elements
- explain event bubbling and capturing clearly
- mention event delegation for lists and dynamic items
- know the difference between text and HTML updates

## 9. Exercises

### Beginner exercises

- select an element by id and change its text
- create a new element and append it
- add a click listener to a button

### Intermediate exercises

- update a list item when a form is submitted
- use `classList` to toggle a style
- read a `data-*` attribute with `dataset`

### Advanced exercises

- implement event delegation for a dynamic list
- explain bubbling vs capturing with a diagram
- compare `innerHTML` and `textContent`

### Recommended LeetCode problems

- DOM simulation warm-ups
- event-driven UI practice tasks

### Recommended HackerRank problems

- browser DOM interaction exercises
- form handling and event tasks
