package com.sprint.mission.discodeit;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.ChannelService;
import com.sprint.mission.discodeit.service.MessageService;
import com.sprint.mission.discodeit.service.UserService;
import com.sprint.mission.discodeit.service.jcf.JCFChannelService;
import com.sprint.mission.discodeit.service.jcf.JCFUserService;
import com.sprint.mission.discodeit.service.jcf.JCFMessageService;

public class JavaApplication {
    public static void main(String[] args) {
        UserService uService = new JCFUserService();
        ChannelService cService = new JCFChannelService();
        MessageService mService = new JCFMessageService();

        System.out.println("객체 생성");
        User user1 = new User("User1");
        User user2 = new User("User2");

        Channel channel1 = new Channel("Channel1");
        Channel channel2 = new Channel("Channel2");

        Message message1 = new Message("Message1");
        Message message2 = new Message("Message2");

        System.out.println("\n--등록--");
        uService.create(user1);
        uService.create(user2);

        cService.create(channel1);
        cService.create(channel2);

        mService.create(message1);
        mService.create(message2);

        System.out.println("\n--조회(단건, 다건)--");
        System.out.println(uService.read(user1.getId()));
        System.out.println(uService.read(user2.getId()));
        System.out.println(uService.rAll() + "\n");

        System.out.println(cService.read(channel1.getId()));
        System.out.println(cService.read(channel2.getId()));
        System.out.println(cService.rAll() + "\n");

        System.out.println(mService.read(message1.getId()));
        System.out.println(mService.read(message2.getId()));
        System.out.println(mService.rAll() + "\n");

        System.out.println("--수정--");
        uService.update(user2, "user22");
        cService.update(channel2, "channel22");
        mService.update(message2, "message22");
        System.out.println("user2 수정된 데이터 조회: " + uService.read(user2.getId()));
        System.out.println("channel2 수정된 데이터 조회: " + cService.read(channel2.getId()));
        System.out.println("message2 수정된 데이터 조회: " + mService.read(message2.getId()));

        System.out.println("\n--삭제--");
        uService.delete(user2.getId());
        cService.delete(channel2.getId());
        mService.delete(message2.getId());
        System.out.println("user2 삭제된 데이터 조회: " + uService.read(user2.getId()));
        System.out.println("channel2 삭제된 데이터 조회: " + cService.read(channel2.getId()));
        System.out.println("message2 삭제된 데이터 조회: " + mService.read(message2.getId()));
    }
}