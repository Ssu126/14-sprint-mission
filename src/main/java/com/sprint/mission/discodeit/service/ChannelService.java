package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.entity.User;

import java.util.List;
import java.util.UUID;

public interface ChannelService {
    Channel create(Channel entity);
    Channel read(UUID id);
    List<Channel> rAll();
    Channel update(Channel entity, String cName);
    void delete(UUID id);
}
