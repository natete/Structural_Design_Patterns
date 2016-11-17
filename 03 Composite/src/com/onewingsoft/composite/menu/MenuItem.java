package com.onewingsoft.composite.menu;

/**
 * Created by natete on 17/11/16.
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print();
    }
}
