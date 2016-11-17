package com.onewingsoft.composite.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natete on 17/11/16.
 */
public abstract class MenuComponent {

    protected String name;
    protected String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public abstract String toString();

    public String print() {
        StringBuilder builder = new StringBuilder(getName());

        builder.append(": ");
        builder.append(getUrl());
        builder.append("\n");
        return builder.toString();
    }
}
