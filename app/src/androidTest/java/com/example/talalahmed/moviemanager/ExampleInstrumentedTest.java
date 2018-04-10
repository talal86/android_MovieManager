package com.example.talalahmed.moviemanager;

import android.app.Activity;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.talalahmed.moviemanager.activities.MainActivity;
import com.example.talalahmed.moviemanager.models.Movie;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.talalahmed.moviemanager", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(
            MainActivity.class ,true,true
    ){};

    @Test
    public void validateRecyclerViewClickThirdElement(){
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition(3,click()));

    }

    public void validateRecyclerViewClickSecondElement(){
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition(2,click()));
    }
}
