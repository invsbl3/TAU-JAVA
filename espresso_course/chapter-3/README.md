# Espresso-TAU (Test Automation University) Course 

### Chapter3-Writing the First Test

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

## IMPORTANT OBSERVATIONS
I lost 3.5 hours trying to create the needed environment to follow the 20min class because of lack of information and 3-year of updates since the release of the class.
Follow this important steps to build your project:
1. Enter in a new directory to put your project, and, with `GIT`, use this command to clone the needed branch to your folder:
    - `git clone -b chapter-3 https://github.com/moatazeldebsy/Espresso-TAU.git`
2. Review the dependencies changes, and, when you put your `setup` in the `app: build.grade` file, copy from [this link](https://developer.android.com/training/testing/espresso/setup#kts) using **double quotes** `" "` if this is pasted with single quotes`' '` inside your `Android Studio`
3. Make the needed changes in your `AndroidManifest.xml` when your dependencies are checked and updated by your IDE (probably `Android Studio`), because it's going to find some conflicts of `deprecated` notations, variables setups and others.
4. Make sure your `Test Device` is turned on (the tests will run with the Phone turned off, and guive you a success message in the Console)...

5. sometimes, for a 20min video of 'painting a car for noobs' you'll need 20h of 'setting up problems and non-told important simple stuff' that is frustrating, boring, stressful.

6. `ActivityTestRule` is deprecated, use `ActivityScenario` instead