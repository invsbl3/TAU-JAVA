## Selenium WebDriver with Java
## Chapter One
Setup... already did for other courses!
Created a `maven quick-start` and added some dependecies in `pom.xml`

## Chapter Two

- Instantiating WebDriver
- Open, Going to URL, Resizing, and Closing Window. 

## Chapter Three
Interacting with Elements (web-locator-course handles this).

- WebPages **change** over time... this means it's very common to get errors because a locator can't find it's target element.
- Basically, a Locator can fail because:
    1. The page didn't load properly yet -> set a `wait timer` before the locator
  2.  The `target-element` changed it's attributes -> have to check the new `webpage` design to find another one.
  3. you simply query for something that doesn't exist in the page.

- if `driver.findElement()` finds more than 1 element, it takes the first one and go ahead not throwing errors!!!!

## Chapter Four
- Creating some `Sub-Environment Class` with only the needed parts of the `Website Pages` we need to test an automation.
- Creating a `BaseTest` and a `LoginTest` that extends from... 

## Chapter Five
Advanced Interactions
- working with `hover`

## Chapter Six
- Using `Keys` in input fields
- Using `chords` to put keys in a sequence

## Chapter Seven
- `JS Alerts` won't appear in DOM. So we have to catch them in a different way.
- Uploading Files
- Modals: when they are visible, you can only interact with them in the page. They are elements in the DOM, so don't need to change context to interact with them.
- Selenium look for elements inside a `<html></html>` tag.

## Chapter Eight
- Editor inside frames are inside a sub `<html></html>` tag (the page have it's tag, and inside the page we have other to the editor)
  - in order to access this data, we need to `change context`, it's like open another page, or switch to a `JS Alert` context.

## Chapter Nine
- `Wait` Strategies...
- `FluentWait`

## Chapter Ten
- Using `JS`

## Chapter Eleven
- Navigation
- `selenium` treats `windows` and `tabs` as the same thing (it appears both of them got some common `code` type that can be a `hash diggest`, a `memory place` or some other `id`)