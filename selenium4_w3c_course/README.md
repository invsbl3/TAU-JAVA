## Selenium 4 in Java
Check [here](https://testautomationu.applitools.com/selenium-4-java/)

## Chapter One
- install last selenium dependency
- checking dependencies of a dependency in my project
- I like to copy the dependencies with the link so its easier to check.

## Chapter Two
W3C WebDriver Protocol

## Chapter Three
Relative Locators
- `element.getBoundingClientRect()` got the base information in JS to model the `relative locator` methods in selenium.

## Chapter Four
- Manage Windows

## Chapter Five
- `getRect()`
- after `Webelement element`, you can find a sub-element with `element.findElement(By.xpath("string"))` with a `string` starting with `.`, like `./div/h3`
  - if you don't put this dot, the `findElement` will return to the beginning of the html to make the search... the `.` indicates that the starting point is the `element`.

## Chapter Six
Screenshots

## Chapter Seven

### Chrome DevTools Protocol
- cast the driver to the BrowserType and then use `.getDevTools()` to instantiate a `DevTools` object to handle and control the `DevTools Platform` of a webBrowser.
- Getting logs with this tool.

### Emulating conditions
- mocking geolocation
- emulating connection speeds


## Certificate of Completion
[here](https://testautomationu.applitools.com/certificate/?id=5092588d)