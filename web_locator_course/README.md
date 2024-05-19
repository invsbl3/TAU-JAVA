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

- These concepts are good to make `Tests` in `non-controled environments`, like some aleatory website in the internet.
  - You probably have more control and know how to make `good locators` to find `elements` in a code you know.

## Chapter Four
### CSS Selectors
- `. element type` -> `element.ClassOfChildElement`
- `# id`
- `element.child element2.child2`-> to take a `element2` that contains a `child2` only if the `element2` is inside a `element.child`.
- `>` forces a `parent -> child` relationship.
- `,` is used as an `logical OR`... `div.username , div.result` -> take any of these
- `ol > li , ul > li` takes any `li` present in a `ol` or a `ul`.
- `element[attribute]` to take an `element` that has a specific `attribute`, like: `div[style="color:green"]`  
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

## Chapter Six

### Advanced Xpaths
`CSS selectors` can't handle text values, indices and relational positions, so, for this, we need to use `Xpath`.

They are more susceptible to have failures, because `texts` and  the `sequence` of elements in a web page can be changed easily, so `indexes` and `relational positions` too.

The guide is to use this only when strict necessary.

#### Text Search:
- `element[contains(.,"some text inside")]`
- `element[contains(text(), "the exact text here")]`

#### Index:
- `(Xpath search here)[3]` gets the third element of the search
- the indexes start counting at 1: 1, 2, 3, ...
- use indexes **only when strict necessary**

#### Nested Descents
- `//element1[.//element2]`

#### Other Searchs:
- `element1[following::element2]` just the `elements1` before `element2` types
- `element1[preceding::element2]` just the `elements1` after `element2` types

## Chapter Seven

There are a lot of Locators implemented anywhere.
Be in touch with their implementations and the news is important, because it's usual to have some locators `broken` over time.

A good guide for Picking a Locator:

1. Test ID using a `data-` attribute
2. ID (if its unique)
3. Input name (if unique)
4. Class name
5. Text value
6. CSS selector
7. XPath without text or indexing
8. Link text or partial link text
9. XPath with text and/or indexing

## Chapter Eight
 I did a `Auto Google Search` script based in `Page Object Model` and a `simple Test Class` to use this.
Here you can check a `simple maven quick-start` with 2 main `dependencies` and 2 Classes made to make the Automation Task.

- ""simple"" is just a word, most of the time this **simples** are gettin me for hours, lol.

### Page Objects and Scrrenplay Pattern
ScreenPlay Pattern works better for large projects, because, as the web-pages are like `live content`, changing over time constantly, separating locators and interactions for greater reusability of Page Objects. 

## My certificate
Yay, [here](https://testautomationu.applitools.com/certificate/?id=4f19d97c) :D