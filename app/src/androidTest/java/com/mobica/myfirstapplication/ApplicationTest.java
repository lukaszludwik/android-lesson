package com.mobica.myfirstapplication;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void test() {
        MojaKlasa mojaKlasa = new MojaKlasa();
        mojaKlasa.addButton(ButtonType.FFWD);
        mojaKlasa.addButton(ButtonType.PLAY);

        assertEquals(2, mojaKlasa.getButtons().size());
    }
}