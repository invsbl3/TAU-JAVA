## Cucumber with Java
### Contents
- Data-Driven
- Dependency Injection
- Parallel Execution
- Reporting
  - pretty format (HTML)

### Downloading Dependencies
- Cucumber-JVM
- Selenium
- TestNG (the course uses JUnit)

## Chapter One
The traditional `waterfall` model have issues solved by a `BDD` ( Behaviour Driven Development) approach.
In a `BDD` approach, the `business analyst` will discuss with `tester` and `developer` in depth the project to have an agreement about it before starting, what avoids to many iterations between lack of information or misunderstandings in the build ground.

## Chapter Two
- Cucumber is a testing tool for `BDD` approach.
- Uses `Gherkin` language (an English text language)
- Step Annotations: `@Given`, `@When`, `@Then`, `@And`, `@But`
- Feature: functionality or module of an app
- Feature File
- Scenario
- Scenario Outline: describes a sequence of actions and conditions to make a feature work.
- Background: add context to scenarios
- Tags: to organize features and scenarios
  - like `@login`, `@smoke`, `@regression`
- Hooks: blocks of code that can run at various point in the Cucumber execution cycle

### Golden Rules
- In a scenario, only one `Given`, `When` and `Then`
- Max two `And` allowed
- Max of `5 steps`. If exceeds, try to split the scenario.

### Best Practices
- Write in `third person` and avoid `personal pronoums`, using instead the `roles`...
  - Instead of `I am logged in` use `the administrator is logged in`
  - The goal is that anyone that takes the `Gerkhin Scenario` can fully understand quickly the Feature and Scenario.
- Avoid to much details, the `scenario` is meant to describe a `flow` . 

## Chapter Three

- Installing Dependencies in `pom.xml`

### IMPORTANT:
- Remember to put `<scope>test</scope>` in `cucumber-java` and other `dependencies`, otherwise you can be stucked by an entire hour because `cucumber` cannot read the modifications you make in your `java classes`.
  - of course never happened to me.
- in `.feature` files, use the tags with `''` , like `'<tag>'` instead of `<tag>`

## Chapter Four
Parallel Execution

## Chapter Five
Reporting Tools

## Certificate Of Completion
[here](https://testautomationu.applitools.com/certificate/?id=0ad79136)