package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Message extends Base {
    private String mName;

    public Message(String mName) {
        super();
        this.mName = mName;
    }
    public String getMName() {
        return mName;
    }
    public void update(String mName) {
        this.mName = mName;
        this.updateTimeStamp();
    }
    public String toString() {
        return String.format("Message(id=%s, mName=%s, createAt=%d, updateAt=%d)",
                id, mName, createdAt, updatedAt);
    }
}
