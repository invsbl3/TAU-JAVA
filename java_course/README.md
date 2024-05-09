## Java Course - Test Automation University

I'm doing this [Java course](https://testautomationu.applitools.com/java-programming-course/) to learn about java (you don't say?!)

## Chapter One

Installing JDK (used 22) and IntelliJ.

## Chapter Two

First simple scripts.

- a big price to say hello: `static void main (String args[]){}` is something big and new as `System.out.prinln()`.
- Simple scripts using `out.println`, `out.printf`, `util.Scanner`
  remembering to `scanner.close()` after using.

- Used and checked a bit about the implementation of primitive types:

  `int`, `string`, `double`, `float`.

- Checked `if` and `else` conditions and some logical operators
  `==`, `.equals()`, `||` && `&&` (lol).

## Chapter Three
Conditioners... When to use:
- `if` when there's only one path
- `if, else` when there are two paths, but one condition to check
- `if + (else if)'s` to execute the code in the `first` condition reached in the sequence
- `switch` to test cases when a condition is checking only euqality `==`... don't forget to use a `break` to close the loop, and a `default` to catch any issues at the end of the cases!

I also checked a bit more about `Double` documentation... never let the user put a  greater than `Double.MAX_VALUE` or less than `Double.MIN_VALUE`... it's hard, I tried in my code, it's waaaay bigger in Java than in JS, lol

I also didn't use `nested if's` when teached, because I don't like nested if's. Instead, I used separated if's with Logical Operators...
Which were mentioned in the last part of this chapter..

## Chapter Four
Loops...
- `while`, `do while`, `for`
- used `debug mode` with a `break point` to check some variable stored values and the logic working
- Java `chars` are encoded with `UTF-16` and stored in `16-bits` unsigned variables.
  I'm taking my time to read [this article](https://www.baeldung.com/java-char-encoding)
- `"A"` is a `String`, and `'A'` is a `char`! Be aware!

## Chapter Five
Methods... 

... They act as a `JS` or `Python` `function`.

Declare a `method` this way:

### The method's `header`:
1. `access modifier`: who is allowed to use this method? `public`, `private`, `protected` 
   if not specified, just `Classes` from the same `package` can access it.

2. `non access modifiers` not every method require this.
3. `return type`: which is the variable type your method returns ?
     
   Your `method` can only return `one single variable`.

    3.1  `void` is used when the method won't return anything.


4. `name`: in general, start with a `verb`. if the `return type == boolean`, use a `question` as the name, like `isTodayAColdDay`.
start with a `lowercase` letter, and then, for each new word, start with `uppercase`.
5. `inputs`: put inside parentesis the `parameters` with their `variable types`, separated by commas and inside a parenthesis, like this: `waterState(double temperature, double altitude, String planet)`

### The method's `body`:
1. after the header, put some code inside curly brackets `{ code here }`;
2. the code should end with a `return variable`, and the `variable` in case should match the `variable type` declared in the method's `header`.
3. nowadays IntelliJ tells you if there are variables declared and not used, and stuff like that, inside your method.
   try to avoid use anything else than `necessary` to use the inputs to compute the `output` returned.

### Variables in a `Class`
It`s important to know about `global` and `static` variables since now.

They are very util to be passed thourgh `methods` inside a `class`.


