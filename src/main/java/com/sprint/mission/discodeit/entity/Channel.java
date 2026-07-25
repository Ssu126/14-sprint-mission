package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Channel extends Base {
    private String cName;

    public Channel(String cName) {
        super();
        this.cName = cName;
    }
    public String getCName() {
        return cName;
    }
    public void update(String cName) {
        this.cName = cName;
        this.updateTimeStamp();
    }
    public String toString() {
        return String.format("Channel(id=%s, cName=%s, createAt=%d, updateAt=%d)",
                id, cName, createdAt, updatedAt);
    }
}
