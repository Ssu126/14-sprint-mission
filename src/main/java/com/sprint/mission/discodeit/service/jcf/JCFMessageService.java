package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.service.ChannelService;
import com.sprint.mission.discodeit.service.MessageService;
import com.sprint.mission.discodeit.service.UserService;

import java.util.*;

public class JCFMessageService implements MessageService {
    private final Map<UUID, Message> database = new HashMap<>();

    @Override
    public Message create(Message entity) {
        database.put(entity.getId(), entity);

        return entity;
    }
    @Override
    public Message read(UUID id) {
        return database.get(id);
    }
    @Override
    public List<Message> rAll() {
        return new ArrayList<>(database.values());
    }
    @Override
    public Message update(Message entity, String mName) {
        entity.update(mName);
        database.put(entity.getId(), entity);

        return entity;
    }
    @Override
    public void delete(UUID id) {
        database.remove(id);
    }
}