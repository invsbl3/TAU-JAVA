package com.example.android.testing.espresso.BasicSample;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ChangeTextBehaviourTest {
    @Rule
    public ActivityScenarioRule<MainActivity> mActivity = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void changeText_sameActivity(){
        onView(withId(R.id.editTextUserInput)).perform(typeText("TEXT HERE"));
        closeSoftKeyboard();
        onView(withId(R.id.changeTextBt)).perform(click());
        onView(withId(R.id.textToBeChanged)).check(matches(withText("TEXT HERE")));

    }
}
