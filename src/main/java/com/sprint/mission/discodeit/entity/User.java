package com.sprint.mission.discodeit.entity;

import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@ToString
public class User extends Base {
    @Getter
    private String uName;

    public User(String uName) {
        super();
        this.uName = uName;
    }
    public void update(String uName) {
        this.uName = uName;
        this.updateTimeStamp();
    }
    private void updateTimeStamp() {
        this.updatedAt = System.currentTimeMillis();
    }
}
