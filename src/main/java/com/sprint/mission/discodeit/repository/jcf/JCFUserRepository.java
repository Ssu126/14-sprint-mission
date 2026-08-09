package com.sprint.mission.discodeit.repository.jcf;

<<<<<<< HEAD
=======
import com.sprint.mission.discodeit.entity.Message;
>>>>>>> upstream/김수영
import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.repository.UserRepository;

import java.util.*;

public class JCFUserRepository implements UserRepository {
<<<<<<< HEAD
    private final Map<UUID, User> data;

    public JCFUserRepository() {
        this.data = new HashMap<>();
    }

    @Override
    public User save(User user) {
        this.data.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> findById(UUID id) {
        return Optional.ofNullable(this.data.get(id));
    }

    @Override
    public List<User> findAll() {
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
>>>>>>> upstream/김수영
    }
}
