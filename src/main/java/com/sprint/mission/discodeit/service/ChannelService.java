package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Channel;
<<<<<<< HEAD
import com.sprint.mission.discodeit.entity.ChannelType;
=======
import com.sprint.mission.discodeit.entity.User;
>>>>>>> upstream/김수영

import java.util.List;
import java.util.UUID;

public interface ChannelService {
<<<<<<< HEAD
    Channel create(ChannelType type, String name, String description);
    Channel find(UUID channelId);
    List<Channel> findAll();
    Channel update(UUID channelId, String newName, String newDescription);
    void delete(UUID channelId);
=======
    Channel create(Channel entity);
    Channel read(UUID id);
    List<Channel> rAll();
    Channel update(Channel entity, String cName);
    void delete(UUID id);
>>>>>>> upstream/김수영
}
