package com.lxy.imapp.biz.event;

import com.lxy.imapp.biz.util.BeanUtil;
import com.lxy.protocolpackage.protocol.friend.AddFriendRequest;
import com.lxy.protocolpackage.protocol.friend.FriendRequest;
import com.lxy.protocolpackage.protocol.friend.SearchFriendRequest;
import javafx.scene.layout.Pane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.Channel;
import java.util.List;

public class ChatEventHandler {
    private Logger logger = LoggerFactory.getLogger(ChatEventHandler.class);
    
    public void doSearchNewFriend(String userId, List<Pane> listView){
        Channel channel = BeanUtil.getChannel();
        channel.writeAndFlush(new SearchFriendRequest(userId, ""));
    }

    public void doFriendLuckSearch(String userId, String text) {
        Channel channel = BeanUtil.getChannel();
        channel.writeAndFlush(new SearchFriendRequest(userId, text));
        System.out.println("发送搜索请求:"+text);
    }

    public void doAddNewUser(String userId, String friendId) {
        Channel channel = BeanUtil.getChannel();
    }

    public void doSendFriendRequest(String userId, String friendId){
        Channel channel = BeanUtil.getChannel();
        channel.writeAndFlush(new FriendRequest(userId, friendId));
        System.out.println("发送好友申请");
    }
}
