package com.ansari.myunittestingproj;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import junit.extensions.TestSetup;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by Ansari on 4/20/2017.
 */
@RunWith(AndroidJUnit4.class)
public class Main2Test {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);



    @Test
    public void clickSignUpButton_opensSignUpScreen() {
        //locate and click on the login button
       /* onView(withId(R.id.button)).perform(click());

        //check if the sign up screen is displayed by asserting that the first name edittext is displayed
        onView(withId(R.id.editText)).check(matches(allOf(isDescendantOfA(withId(R.id.textView)), isDisplayed())));*/

        /*onView(withId(R.id.editText))
                .perform(typeText("HELLO"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.textViewResult)).check(matches(withText("HELLO")));*/

        {
            /*Intent intent = new Intent();
            intent.putExtra("EXTRA", "Test");
            activityTestRule.launchActivity (intent);
            onView(withId(R.id.textViewResult)).check(matches(withText("Test")));*/


            onView(withId(R.id.button)).perform(click());

            //check if the sign up screen is displayed by asserting that the first name edittext is displayed
            onView(withId(R.id.editText)).check(matches(allOf(isDescendantOfA(withId(R.id.mysecondlayout)), isDisplayed())));
        }
    }



    /*@Test
    public void testClickbutton(){

        onView(withId(R.id.editText)).perform(typeText("John"));

// locate the view with id "next" and click on it
        onView(withId(R.id.button)).perform(click());

// locate the view with id "greeting_message" and check its text is equal with "Hello John!"
        onView(withId(R.id.textViewResult)).check(matches(withText("Hello John!")));
    }*/
}
