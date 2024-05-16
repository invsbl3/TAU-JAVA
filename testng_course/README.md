## Introduction to TestNG

Test Next Generation is a powerful tool, very correlated with JUnit, but with more features, to help Test Automation Works.
Course [here](https://testautomationu.applitools.com/introduction-to-testng/).

## Chapter 1
Introduction, some explanations.

## Chapter 2
Downloading and installing TestNG

## Chapter 3
Annotations:
- `Pre-Conditions` start with `@Before`
- `Condition(s)` start with `@Test`
- `Post-Conditions` start with `@After`

I started a new `maven project` with the `quick-start archetype` from `apache maven` and put manually the `TestNG` dependency in my `pom.xml` file.
It worked! The annotations are getting linked in the code!

Understanding a bit about the `annotations`, their `workflow` and how they are related to the `steps` that were automated in the `UI`.

## Chpater 4
- `XML` files are used to store data in a structured way, like `JSON`.
- `TestNG` uses `xml` files to store test configurations.
- `tags` hierarchy: `<suite>` -> `<test>` -> `<class>` -> `<methods>` -> `<include>`, such as the `annotations @` for `java-maven` projects.

## Chapter 5
Check [it out](https://testng.org/annotations.html)

- Without `anntotations @`, `TestNG` runs the `methods` in **alphabetical order**!
- `methods` with `same annotation` will run in **alphabetical order** too!
- use `@Annotation (priority = number)` to set a sequence in which the `methods` of same annotation should run, if not alphabetically.
- `private` methods in the `Test Class` won't run. Make them `public`.

## Chapter 6
- `Assertions` verify if a `test` really passed of failed.
- The `Class Assert` has `methods` : `assertTrue`, `assertFalse`, `assertSame`, `assertNotSame`, `assertNotNull`, `assertEquals`.
- Use the `assert methods` inside the `Test methods` to check gathered data.
- `TestNG` uses same `classes` to be compatible with `JUnit`

### Hard Asserts
- When a `hard assert` fails, it stops execution and move to the `next @Annotation` (next `method` to be called in the `Test Class`)

### Soft Assert
- Continues execution after a `fail`. It doesn't matter if this is a `@Test` or `@Configuration`.


- **Always** use `assertAll` with `softAssert` !!!


- `try / catch` blocks with `assertionMethods` inside **won't work** to make a `soft warning`...
  - ... because, after the first assertion that won't pass, the `try` block will `break` and `throw` an `Exception` handled by the `catch` block. So The code won't run the `next assertions` inside the `try block`. The `console` will show a log telling the first `assertion error`, the `results` will show that the tests `passed`, but in the `console` you can check that the tests inside the `try` block seemed to simply not even `runned`!

## Chapter 7
### Dependency Test
- When `two or more features` depend on the order of the `methods` with `same @Annotation`.

- using `dependsOnMethod` attribute:
  - `@Test ( dependsOnMethods = "test_1")` 
  - `@Test ( dependsOnMethods = { "test_1", "test_2" } )`
  - So, for example, if a `searchProduct` and `addToCart` methods dependsOnMethods `setUpBrowser` and `signIn`, you can associate them properly.

### Groups Attribute
- to make easier to construct various types of tests that use some `methods` in common, we can `flag` the `methods` for each `test setup` we create.

-`smoke test`: to assure the most important `functions` of an `application` are working after `build`

- `dependsOnGroups` can be used.

- it's a good practice to create a `defect` test group, both to skip them in a test, or to run them in sequence.
- `@Annotation (group = {"group_1", "group_2"})`

- How to create a `TestNG xml` file to load a specific test [here](https://www.softwaretestinghelp.com/testng-example-to-create-testng-xml/)

- I tested some of these features in this `maven project` and created some `TestNG.xml` files to check their functionality.
- One can `<include />` or `<exclude />` groups in a test.

- If a test is in at the same time in a group `included` and in a group `excluded` in a `TestNG xml`, it won't run in the test!