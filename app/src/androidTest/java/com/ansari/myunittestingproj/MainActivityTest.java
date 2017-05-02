package com.ansari.myunittestingproj;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Ansari on 4/19/2017.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest  {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);



   /* @Test
    public void validateEditText() {
        onView(withId(R.id.editText)).perform(typeText("Hello")).check(matches(withText("Hello")));
    }*/

    @Test
    public void testClickbutton(){
        onView(withId(R.id.button))
                .perform(click());
        onView(withId(R.id.textView))
                .check(matches(isDisplayed()));
    }



}
