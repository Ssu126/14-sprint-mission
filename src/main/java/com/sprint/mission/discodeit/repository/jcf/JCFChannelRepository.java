package com.sprint.mission.discodeit.repository.jcf;

import com.sprint.mission.discodeit.entity.Channel;
<<<<<<< HEAD
=======
import com.sprint.mission.discodeit.entity.Message;
>>>>>>> upstream/김수영
import com.sprint.mission.discodeit.repository.ChannelRepository;

import java.util.*;

public class JCFChannelRepository implements ChannelRepository {
<<<<<<< HEAD
    private final Map<UUID, Channel> data;

    public JCFChannelRepository() {
        this.data = new HashMap<>();
    }

    @Override
    public Channel save(Channel channel) {
        this.data.put(channel.getId(), channel);
        return channel;
    }

    @Override
    public Optional<Channel> findById(UUID id) {
        return Optional.ofNullable(this.data.get(id));
    }

    @Override
    public List<Channel> findAll() {
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
>>>>>>> upstream/김수영
    }
}
