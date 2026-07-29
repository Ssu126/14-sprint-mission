package com.sprint.mission.discodeit.repository.jcf;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.repository.ChannelRepository;

import java.util.*;

public class JCFChannelRepository implements ChannelRepository {
    private final Map<UUID, Channel> data = new HashMap<>();

    @Override
    public Channel save(Channel entity) {
        data.put(entity.getId(), entity);

        return data.get(entity.getId());
    }
    @Override
    public Channel read(UUID id) {
        return data.get(id);
    }
    @Override
    public List<Channel> rAll() {
        return new ArrayList<>(data.values());
    }
    @Override
    public void delete(UUID id) {
        data.remove(id);
    }
}
