package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class User extends Base {
    private String uName;

    public User(String uName) {
        super();
        this.uName = uName;
    }
    public String getUName() {
        return uName;
    }
    public void update(String uName) {
        this.uName = uName;
        this.updateTimeStamp();
    }
    public String toString() {
        return String.format("User(id=%s, uName=%s, createAt=%d, updateAt=%d)",
                id, uName, createdAt, updatedAt);
    }
}
