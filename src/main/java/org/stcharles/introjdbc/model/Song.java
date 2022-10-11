package org.stcharles.introjdbc.model;

import java.time.Duration;

public class Song extends Entity {
    private final String title;
    private final Duration length;

    public Song(String title, Duration length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public Duration getLength() {
        return length;
    }
}
