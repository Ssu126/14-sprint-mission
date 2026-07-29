package com.sprint.mission.discodeit.entity;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Channel extends Base {
    @Getter
    private String cName;

    public Channel(String cName) {
        super();
        this.cName = cName;
    }
    public void update(String cName) {
        this.cName = cName;
        this.updateTimeStamp();
    }
    private void updateTimeStamp() {
        this.updatedAt = System.currentTimeMillis();
    }
}
