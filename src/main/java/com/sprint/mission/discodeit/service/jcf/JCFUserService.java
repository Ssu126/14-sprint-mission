package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.repository.UserRepository;
import com.sprint.mission.discodeit.service.UserService;
import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class JCFUserService implements UserService {
    private final UserRepository uRepository;

    @Override
    public User create(User entity) {
        return uRepository.save(entity);
    }
    @Override
    public User read(UUID id) {
        return uRepository.read(id);
    }
    @Override
    public List<User> rAll() {
        return uRepository.rAll();
    }
    @Override
    public User update(User entity, String uName) {
        entity.update(uName);

        return uRepository.save(entity);
    }
    @Override
    public void delete(UUID id) {
        uRepository.delete(id);
    }
}