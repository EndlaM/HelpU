package fr.miage.paris10.projetm1.helpu;

import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

/**
 * Created by david on 3/14/17.
 */

//@RunWith(AndroidJUnit4.class)
public class BecomeHelperActivityTest {

    //@Rule
    public ActivityTestRule<BecomeHelperActivity> BecomeHelperActivityRule  = new ActivityTestRule<>(BecomeHelperActivity.class);


  //  @Test
    public void testChoixEc()  throws InterruptedException {
        onView(withId(R.id.spinner_BecomeHelper_ec)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Statistique"))).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.button_BecomeHelper_valider)).perform(click());
    }

}
