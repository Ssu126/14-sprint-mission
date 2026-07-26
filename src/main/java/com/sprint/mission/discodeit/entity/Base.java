package com.sprint.mission.discodeit.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class Base {
    protected final UUID id;
    protected final Long createdAt;
    protected Long updatedAt;

    public Base() {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = createdAt;
    }
}
