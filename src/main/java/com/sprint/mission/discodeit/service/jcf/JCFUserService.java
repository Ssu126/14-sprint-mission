package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.UserService;

import java.util.*;

public class JCFUserService implements UserService {
    private final Map<UUID, User> database = new HashMap<>();

    @Override
    public User create(User entity) {
        database.put(entity.getId(), entity);
        return entity;
    }
    @Override
    public User read(UUID id) {
        return database.get(id);
    }
    @Override
    public List<User> rAll() {
        return new ArrayList<>(database.values());
    }
    @Override
    public User update(User entity, String uName) {
        entity.update(uName);
        database.put(entity.getId(), entity);

        return entity;
    }
    @Override
    public void delete(UUID id) {
        database.remove(id);
    }
}
