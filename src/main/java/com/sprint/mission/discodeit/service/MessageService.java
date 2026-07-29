package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.entity.User;

import java.util.List;
import java.util.UUID;

public interface MessageService {
    Message create(Message entity);
    Message read(UUID id);
    List<Message> rAll();
    Message update(Message entity, String mName);
    void delete(UUID id);

}
