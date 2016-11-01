package com.onewingsoft.bridge;

import java.util.List;

/**
 * Created by natete on 01/11/16.
 */
public class HtmlFormatter implements Formatter {
    @Override public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<h1>").append(header).append("</h1>");
        builder.append("\n");

        for (Detail detail : details) {
            builder.append("<div>").append("<strong>").append(detail.getLabel()).append("</strong>");
            builder.append(": ").append(detail.getValue()).append("</div>\n");
        }

        return builder.toString();
    }
}
