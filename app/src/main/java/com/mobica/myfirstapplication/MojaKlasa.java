package com.mobica.myfirstapplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lulu on 01.12.15.
 */
public class MojaKlasa {
    private List<IButton> buttons = new ArrayList<>();

    public void addButton(ButtonType button) {
        buttons.add(button);
    }

    public void removeButton(ButtonType button) {
        buttons.remove(button);
    }

    public void removeAll() {
        buttons.clear();
    }

    public List<IButton> getButtons() {
        return buttons;
    }

    public void listElements() {
        for (IButton button : buttons) {
            System.out.println(button.getButtonId() + " and value is: "+ button.getButtonId().getId());
        }
    }

}
