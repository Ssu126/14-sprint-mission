package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.Message;

import java.util.List;
import java.util.UUID;

public interface MessageRepository {
    Message save(Message entity);
    Message read(UUID id);
    List<Message> rAll();
    void delete(UUID id);
}
