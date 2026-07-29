package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.Channel;

import java.util.List;
import java.util.UUID;

public interface ChannelRepository {
    Channel save(Channel entity);
    Channel read(UUID id);
    List<Channel> rAll();
    void delete(UUID id);
}
