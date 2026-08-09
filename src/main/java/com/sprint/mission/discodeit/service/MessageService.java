package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Message;
<<<<<<< HEAD
=======
import com.sprint.mission.discodeit.entity.User;
>>>>>>> upstream/김수영

import java.util.List;
import java.util.UUID;

public interface MessageService {
<<<<<<< HEAD
    Message create(String content, UUID channelId, UUID authorId);
    Message find(UUID messageId);
    List<Message> findAll();
    Message update(UUID messageId, String newContent);
    void delete(UUID messageId);
=======
    Message create(Message entity);
    Message read(UUID id);
    List<Message> rAll();
    Message update(Message entity, String mName);
    void delete(UUID id);

>>>>>>> upstream/김수영
}
