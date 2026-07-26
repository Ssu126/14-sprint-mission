package com.sprint.mission.discodeit.repository.file;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.repository.MessageRepository;

import java.io.*;
import java.util.*;

public class FileMessageRepository implements MessageRepository {
    private final String fileName = "messages.ser";
    private final Map<UUID, Message> fileMap = findMap();

    private Map<UUID, Message> findMap() {
        File file = new File(fileName);

        if(!file.exists()) {
            return new HashMap<>();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Map<UUID, Message> loadedMap = (Map<UUID, Message>) ois.readObject();

            return loadedMap;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    public void saveMapToFile(Map<UUID, Message> map) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Message save(Message entity) {
        fileMap.put(entity.getId(), entity);
        saveMapToFile(fileMap);

        return fileMap.get(entity.getId());
    }
    @Override
    public Message read(UUID id) {
        return fileMap.get(id);
    }
    @Override
    public List<Message> rAll() {
        return new ArrayList<>(fileMap.values());
    }
    @Override
    public void delete(UUID id) {
        fileMap.remove(id);
        saveMapToFile(fileMap);
    }
}
