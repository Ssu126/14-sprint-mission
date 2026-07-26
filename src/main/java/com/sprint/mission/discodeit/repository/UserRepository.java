package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    User save(User entity);
    User read(UUID id);
    List<User> rAll();
    void delete(UUID id);
}
