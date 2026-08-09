package com.sprint.mission.discodeit.service;

<<<<<<< HEAD
import com.sprint.mission.discodeit.dto.UserCreateRequest;
import com.sprint.mission.discodeit.dto.UserResponse;
=======
>>>>>>> upstream/김수영
import com.sprint.mission.discodeit.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
<<<<<<< HEAD
    UserResponse create(UserCreateRequest request);
    UserResponse find(UUID userId);
    List<User> findAll();
    User update(UUID userId, String newUsername, String newEmail, String newPassword);
    void delete(UUID userId);
=======
    User create(User entity);
    User read(UUID id);
    List<User> rAll();
    User update(User entity, String uName);
    void delete(UUID id);
>>>>>>> upstream/김수영
}
