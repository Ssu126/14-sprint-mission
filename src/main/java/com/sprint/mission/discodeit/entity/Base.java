package com.sprint.mission.discodeit.entity;

import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

@Getter
public abstract class Base implements Serializable {
    private static final long serialVersionUID = 1L;

    protected final UUID id;
    protected final Long createdAt;
    protected Long updatedAt;

    public Base() {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = createdAt;
    }
}
