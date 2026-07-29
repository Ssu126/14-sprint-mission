package com.sprint.mission.discodeit.repository.file;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.repository.UserRepository;

import java.io.*;
import java.util.*;

public class FileUserRepository implements UserRepository {
    private final String fileName = "users.ser";
    private final Map<UUID, User> fileMap = findMap();

    private Map<UUID, User> findMap() {
        File file = new File(fileName);

        if(!file.exists()) {
            return new HashMap<>();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Map<UUID, User> loadedMap = (Map<UUID, User>) ois.readObject();

            return loadedMap;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    public void saveMapToFile(Map<UUID, User> map) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User save(User entity) {
        fileMap.put(entity.getId(), entity);
        saveMapToFile(fileMap);

        return fileMap.get(entity.getId());
    }
    @Override
    public User read(UUID id) {
        return fileMap.get(id);
    }
    @Override
    public List<User> rAll() {
        return new ArrayList<>(fileMap.values());
    }
    @Override
    public void delete(UUID id) {
        fileMap.remove(id);
        saveMapToFile(fileMap);
    }
}
