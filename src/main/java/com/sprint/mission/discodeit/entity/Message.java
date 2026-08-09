package com.sprint.mission.discodeit.entity;

<<<<<<< HEAD
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import lombok.Getter;

@Getter
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;
    private Instant createdAt;
    private Instant updatedAt;
    private String content;
    private UUID channelId;
    private UUID authorId;
    private List<UUID> attachmentIds;

    public Message(String content, UUID channelId, UUID authorId, List<UUID> attachmentIds) {
        this.id = UUID.randomUUID();
        this.createdAt = Instant.now();
        this.content = content;
        this.channelId = channelId;
        this.authorId = authorId;
        this.attachmentIds = attachmentIds;
    }

    public void update(String newContent, List<UUID> newAttachmentIds) {
        boolean anyValueUpdated = false;
        if (newContent != null && !newContent.equals(this.content)) {
            this.content = newContent;
            anyValueUpdated = true;
        }
        if (newAttachmentIds != null && !newAttachmentIds.equals(this.attachmentIds)) {
            this.attachmentIds = newAttachmentIds;
            anyValueUpdated = true;
        }

        if (anyValueUpdated) {
            this.updatedAt = Instant.now();
        }
=======
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
>>>>>>> upstream/김수영
    }
}
