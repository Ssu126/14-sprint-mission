package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.UserService;

import java.util.*;

public class JCFUserService implements UserService {
    private final Map<UUID, User> data = new HashMap<>();

    @Override
    public User create(User entity) {
        data.put(entity.getId(), entity);
        return entity;
    }
    @Override
    public User read(UUID id) {
        return data.get(id);
    }
    @Override
    public List<User> rAll() {
        return new ArrayList<>(data.values());
    }
    @Override
    public User update(User entity, String uName) {
        entity.update(uName);
        data.put(entity.getId(), entity);

        return entity;
    }
    @Override
    public void delete(UUID id) {
        data.remove(id);
    }
}