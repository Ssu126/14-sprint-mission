package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.service.ChannelService;
import com.sprint.mission.discodeit.service.MessageService;
import com.sprint.mission.discodeit.service.UserService;

import java.util.*;

public class JCFMessageService implements MessageService {
    private final Map<UUID, Message> data = new HashMap<>();
    private UserService uService;
    private ChannelService cService;

    public JCFMessageService(UserService uService, ChannelService cService) {
        this.uService = uService;
        this.cService = cService;
    }

    @Override
    public Message create(Message entity) {
        if(uService.read(entity.getUserId()) == null) {
            throw new IllegalArgumentException("존재하지 않는 UserId : " + entity.getUserId());
        }
        if(cService.read(entity.getChannelId()) == null) {
            throw new IllegalArgumentException("존재하지 않는 ChannelId : " + entity.getChannelId());
        }
        data.put(entity.getId(), entity);

        return entity;
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
    public Message update(Message entity, String mName) {
        entity.update(mName);
        data.put(entity.getId(), entity);

        return entity;
    }
    @Override
    public void delete(UUID id) {
        data.remove(id);
    }
}