package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public abstract class Base {
    protected final UUID id;
    protected final Long createdAt;
    protected Long updatedAt;

    public Base() {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = updatedAt;
    }
    public UUID getId() {
        return id;
    }
    public Long getCreatedAt() {
        return createdAt;
    }
    public Long getUpdatedAt() {
        return updatedAt;
    }
    public void updateTimeStamp() {
        this.updatedAt = System.currentTimeMillis();
    }
}
