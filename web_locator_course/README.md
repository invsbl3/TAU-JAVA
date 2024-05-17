## Web Element Locator Strategies

## Chapter One
### What's in a Web Page?
Under the hood:
- HTML: structure of `elements` in a page.
  - you can `identify` the `elements` by their `types`, `classes`, a given `id` or `position` 
- CSS: style for the `elements`. You can pass CSS `styles` for `HTML elements` in three main ways:
  1. in a separated `.css` file
  2. in a `<style></style>` division inside the HTML
  3. as an attribute for a `HTML element`, like: `<div style="style here!"></div>`

- JS: can `interact` with `HTML elements` of a webpage, making them `dynamic`. You can put JS code in two main ways:
    1. creating a `.js` script and using a `<script scr="place of the script">` in the `HTML`
  2. inside the `HTML` directly like `<script> code here! </script>`

## Chapter Two
### Programming with the DOM
`DOM` - Document Object Model
- a `locator` is a `method/function` that makes a `query` to `find` and `return` a `web element object` from the `DOM`
- associate a `locator` with an `object` to be handled in some `programming language`.

## Chapter Three
### Finding Live Web Elements
- Using right click -> `inspect` in `Chrome` to check it's `HTML` code with the `actual states` of the `elements`, the `CSS` utilized and some `JS` scripts, `loaded files` with `time progression` of loading elements, and more features!
- A good `locator` is not `wider` that takes too much `false positive` elements, and not to `strict` that could `fail` without take a `target-element` present in a page.
    1. a `good locator` is the `simplest` locator that finds a `unique` specific `target-element`.

- This concepts are good to make `Tests` in `non-controled environments`, like some aleatory website in the internet.
  - You probably have more control and know how to make `good locators` to find `elements` in a code you know.

## Chapter Four
### CSS Selectors
- `. element type` -> `element.ClassOfChildElement`
- `# id`
- `element.child element2.child2`-> to take a `element2` that contains a `child2` only if the `element2` is inside a `element.child`.
- `>` forces a `parent -> child` relationship.
- `,` is used as an `logical OR`... `div.username , div.result` -> take any of these
- `ol > li , ul > li` takes any `li` present in a `ol` or a `ul`.
- `element[attribute]` to take an `element` that has an specific `attribute`, like: `div[style="color:green"]`  
- `*` is used to mean `contains`: like `div[class*="user"]` would take a `div` when the `class` attribute contains `user`, like this one: `<div class="NoooouserNameHERE">`

## Chapter Five
### Xpaths
The most powerful, but most complicated `locator-type`:
- `/element1/element2/element3 .... ` until reach the element you need
- `//element` to take only this type of element in the page.
- `/` to take a child element: `element/child`
- `element[@attribute="attribute name"]`
- `element[@attribute < value][@attribute2 > value2]`
- `element[@attribute="name" or @attrib2="n2"]`
- `element[contains(@class, "something")]`
- `element[starts-with(@class, "something")]`