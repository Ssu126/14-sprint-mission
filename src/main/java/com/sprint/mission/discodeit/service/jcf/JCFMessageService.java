package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.repository.MessageRepository;
import com.sprint.mission.discodeit.service.ChannelService;
import com.sprint.mission.discodeit.service.MessageService;
import com.sprint.mission.discodeit.service.UserService;
import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class JCFMessageService implements MessageService {
    private final MessageRepository mRepository;
    private final UserService uService;
    private final ChannelService cService;

    @Override
    public Message create(Message entity) {
        if(uService.read(entity.getUserId()) == null) {
            throw new IllegalArgumentException("존재하지 않는 UserId : " + entity.getUserId());
        }
        if(cService.read(entity.getChannelId()) == null) {
            throw new IllegalArgumentException("존재하지 않는 ChannelId : " + entity.getChannelId());
        }
        return mRepository.save(entity);
    }
    @Override
    public Message read(UUID id) {
        return mRepository.read(id);
    }
    @Override
    public List<Message> rAll() {
        return mRepository.rAll();
    }
    @Override
    public Message update(Message entity, String mName) {
        entity.update(mName);

        return mRepository.save(entity);
    }
    @Override
    public void delete(UUID id) {
        mRepository.delete(id);
    }
}