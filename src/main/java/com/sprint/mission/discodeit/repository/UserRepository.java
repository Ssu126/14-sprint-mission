package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.User;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(UUID id);
    List<User> findAll();
    boolean existsById(UUID id);
    void deleteById(UUID id);
=======
import java.util.UUID;

public interface UserRepository {
    User save(User entity);
    User read(UUID id);
    List<User> rAll();
    void delete(UUID id);
>>>>>>> upstream/김수영
}
