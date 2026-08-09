package com.sprint.mission.discodeit.repository.jcf;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.repository.MessageRepository;

import java.util.*;

public class JCFMessageRepository implements MessageRepository {
<<<<<<< HEAD
    private final Map<UUID, Message> data;

    public JCFMessageRepository() {
        this.data = new HashMap<>();
    }

    @Override
    public Message save(Message message) {
        this.data.put(message.getId(), message);
        return message;
    }

    @Override
    public Optional<Message> findById(UUID id) {
        return Optional.ofNullable(this.data.get(id));
    }

    @Override
    public List<Message> findAll() {
        return this.data.values().stream().toList();
    }

    @Override
    public boolean existsById(UUID id) {
        return this.data.containsKey(id);
    }

    @Override
    public void deleteById(UUID id) {
        this.data.remove(id);
=======
    private final Map<UUID, Message> data = new HashMap<>();

    @Override
    public Message save(Message entity) {
        data.put(entity.getId(), entity);

        return data.get(entity.getId());
    }
    @Override
    public Message read(UUID id) {
        return data.get(id);
    }
    @Override
    public List<Message> rAll() {
        return new ArrayList<>(data.values());
    }
    @Override
    public void delete(UUID id) {
        data.remove(id);
>>>>>>> upstream/김수영
    }
}
