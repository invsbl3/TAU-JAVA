## Android Test Automation with Espresso

- `Espresso` is a native testing framework for Android to write UI tests.

- Its part of the Android Support Repository.

There are two `Android UI Tests`:
- for single apps with `Espresso`
- for multiple apps with `UI Automator`

## Chapter One
- Espresso requires AndroidJUnitRunner to work

## Chapter Two
### Setting up Espresso
- JDK
- [Gradle](https://gradle.org/next-steps/?version=8.7&format=all)
- Android Dev Tools and Studio
### Android Studio Important Menus

## Chapter Three
Writing the First Test

### Resources
- Espresso Test Recorder
  https://developer.android.com/studio/test/espresso-test-recorder

- UIAutomatorViewer
  https://developer.android.com/training/testing/ui-automator#ui-automator-viewer

- Layout Inspector
  https://developer.android.com/studio/debug/layout-inspector

- Espresso Basic
  https://developer.android.com/training/testing/espresso/basics


### References Project
- https://github.com/android/testing-samples (not working)

### IMPORTANT OBSERVATIONS
I lost 3.5 hours trying to create the needed environment to follow the 20min class because of lack of information and 3-year of updates since the release of the class.
Follow this important steps to build your project:
1. Enter a new directory to put your project, and, with `GIT`, use this command to clone the needed branch to your folder:
   - `git clone -b chapter-3 https://github.com/moatazeldebsy/Espresso-TAU.git`
2. Review the dependencies changes, and, when you put your `setup` in the `app: build.grade` file, copy from [this link](https://developer.android.com/training/testing/espresso/setup#kts) using **double quotes** `" "` if this is pasted with single quotes`' '` inside your `Android Studio`
3. Make the needed changes in your `AndroidManifest.xml` when your dependencies are checked and updated by your IDE (probably `Android Studio`), because it's going to find some conflicts of `deprecated` notations, variables setups and others.
4. Make sure your `Test Device` is turned on (the tests will run with the Phone turned off, and give you a success message in the Console)...

5. sometimes, for a 20min video of 'painting a car for noobs' you'll need 20h of 'setting up problems and non-told important simple stuff' that is frustrating, boring, stressful.

6. `ActivityTestRule` is deprecated, use `ActivityScenario` instead

## Chapter 4
### Data Adapter
- `git clone -b chapter-4-DataAdapterSample https://github.com/moatazeldebsy/Espresso-TAU.git`

As the course implementation needs the environment set to be done, and the cloned repositories needs too much re-configurations to run, I'm going to just watch them to understand the methods and tools utilized. As I'm already familiarized with JUnit, TestNG and Selenium, I think I can skip the implementation and still getting the knowledge needed.

- In this chapter we can see an implementation to test if the last element of a big list is reachable and if it appears entirely on the screen.
  - Using this + a script to run in multiple screen types and devices, we can check if the menus of an app are working properly on the users' interface and screen.

### Drawer
- How to access and work with drawers, changing the screen-context of the app and checking.

## Chapter Five
Espresso-Web

## Chapter Six
Synchronization with Espresso
- Some actions have a waiting time to show on screen or to have effect.