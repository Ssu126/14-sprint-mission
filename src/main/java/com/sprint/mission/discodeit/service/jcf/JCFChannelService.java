package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.repository.ChannelRepository;
import com.sprint.mission.discodeit.service.ChannelService;
import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class JCFChannelService implements ChannelService {
    private final ChannelRepository cRepository;

    @Override
    public Channel create(Channel entity) {
        return cRepository.save(entity);
    }
    @Override
    public Channel read(UUID id) {
        return cRepository.read(id);
    }
    @Override
    public List<Channel> rAll() {
        return cRepository.rAll();
    }
    @Override
    public Channel update(Channel entity, String cName) {
        entity.update(cName);

        return cRepository.save(entity);
    }
    @Override
    public void delete(UUID id) {
        cRepository.delete(id);
    }
}