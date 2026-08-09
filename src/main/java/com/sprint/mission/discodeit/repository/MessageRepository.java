package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.Message;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
import java.util.UUID;

public interface MessageRepository {
    Message save(Message message);
    Optional<Message> findById(UUID id);
    List<Message> findAll();
    boolean existsById(UUID id);
    void deleteById(UUID id);
=======
import java.util.UUID;

public interface MessageRepository {
    Message save(Message entity);
    Message read(UUID id);
    List<Message> rAll();
    void delete(UUID id);
>>>>>>> upstream/김수영
}
