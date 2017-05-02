package com.ansari.myunittestingproj;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Ansari on 4/20/2017.
 */
public class ExampleTest extends ActivityInstrumentationTestCase2 {
    public ExampleTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testClick(){
        String s = "this is testing";
        Espresso.onView(ViewMatchers.withId(R.id.editText))
                .perform(ViewActions.typeText(s));
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());
        Espresso.onView ( ViewMatchers.withId ( R.id.textViewtest ) )
                .check ( ViewAssertions.matches ( ViewMatchers.withText ( s ) ) );



    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
