package com.mobica.myfirstapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void isCorrect() {
        MojaKlasa mojaKlasa = new MojaKlasa();
        mojaKlasa.addButton(ButtonType.FFWD);
        mojaKlasa.addButton(ButtonType.PLAY);
        mojaKlasa.listElements();
        assertEquals(2, mojaKlasa.getButtons().size());
    }
}