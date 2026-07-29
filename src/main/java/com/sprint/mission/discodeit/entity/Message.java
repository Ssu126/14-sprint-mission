package com.sprint.mission.discodeit.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
@RequiredArgsConstructor
public class Message extends Base {
    private String mName;
    private UUID userId;
    private UUID channelId;

    public Message(String mName, UUID userId, UUID channelId) {
        super();
        this.mName = mName;
        this.userId = userId;
        this.channelId = channelId;
    }
    public void update(String mName) {
        this.mName = mName;
        this.updateTimeStamp();
    }
    private void updateTimeStamp() {
        this.updatedAt = System.currentTimeMillis();
    }
}
