package org.stcharles.introjdbc.model;

import java.util.UUID;

public abstract class Entity {
    private final UUID id;

    protected Entity() {
        this.id = UUID.randomUUID();
    }

    protected Entity(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
