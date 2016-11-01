package com.onewingsoft.bridge;

import java.util.List;

/**
 * Created by natete on 01/11/16.
 */
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();
}
