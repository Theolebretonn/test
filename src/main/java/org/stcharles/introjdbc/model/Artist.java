package org.stcharles.introjdbc.model;

import java.util.UUID;

public class Artist extends Entity {
    private final String name;

    public Artist(String name) {
        this.name = name;
    }

    public Artist(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
