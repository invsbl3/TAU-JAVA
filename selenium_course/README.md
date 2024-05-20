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