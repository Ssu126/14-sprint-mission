package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.service.ChannelService;

import java.util.*;

public class JCFChannelService implements ChannelService {
    private final Map<UUID, Channel> database = new HashMap<>();

    @Override
    public Channel create(Channel entity) {
        database.put(entity.getId(), entity);

        return entity;
    }
    @Override
    public Channel read(UUID id) {
        return database.get(id);
    }
    @Override
    public List<Channel> rAll() {
        return new ArrayList<>(database.values());
    }
    @Override
    public Channel update(Channel entity, String cName) {
        entity.update(cName);
        database.put(entity.getId(), entity);

        return entity;
    }
    @Override
    public void delete(UUID id) {
        database.remove(id);
    }
}
