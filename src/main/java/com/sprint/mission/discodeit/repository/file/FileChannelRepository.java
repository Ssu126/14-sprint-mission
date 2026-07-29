package com.sprint.mission.discodeit.repository.file;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.repository.ChannelRepository;

import java.io.*;
import java.util.*;

public class FileChannelRepository implements ChannelRepository {
    private final String fileName = "channels.ser";
    private final Map<UUID, Channel> fileMap = findMap();

    private Map<UUID, Channel> findMap() {
        File file = new File(fileName);

        if(!file.exists()) {
            return new HashMap<>();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Map<UUID, Channel> loadedMap = (Map<UUID, Channel>) ois.readObject();

            return loadedMap;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    public void saveMapToFile(Map<UUID, Channel> map) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Channel save(Channel entity) {
        fileMap.put(entity.getId(), entity);
        saveMapToFile(fileMap);

        return fileMap.get(entity.getId());
    }
    @Override
    public Channel read(UUID id) {
        return fileMap.get(id);
    }
    @Override
    public List<Channel> rAll() {
        return new ArrayList<>(fileMap.values());
    }
    @Override
    public void delete(UUID id) {
        fileMap.remove(id);
        saveMapToFile(fileMap);
    }
}