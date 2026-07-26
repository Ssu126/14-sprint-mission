package com.sprint.mission.discodeit.repository.jcf;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.repository.UserRepository;

import java.util.*;

public class JCFUserRepository implements UserRepository {
    private final Map<UUID, User> data = new HashMap<>();

    @Override
    public User save(User entity) {
        data.put(entity.getId(), entity);

        return data.get(entity.getId());
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
    public void delete(UUID id) {
        data.remove(id);
    }
}
