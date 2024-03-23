package com.lxy.imapp.biz.socket;
import com.lxy.imapp.biz.socket.handler.impl.AddFriendRequestHandler;
import com.lxy.imapp.biz.socket.handler.impl.LoginHandler;
import com.lxy.imapp.biz.socket.handler.impl.SearchFriendHandler;
import com.lxy.imapp.front.ImUI;
import com.lxy.protocolpackage.codec.ObjDecoder;
import com.lxy.protocolpackage.codec.ObjEncoder;
import com.lxy.protocolpackage.protocol.login.LoginRequest;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

public class IMClientChannelInitializer extends ChannelInitializer<SocketChannel> {

    private ImUI imUI;

    public IMClientChannelInitializer(ImUI imUI) {
        this.imUI = imUI;
    }

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(new ObjDecoder());
        socketChannel.pipeline().addLast(new LoginHandler(imUI));
        socketChannel.pipeline().addLast(new SearchFriendHandler(imUI));
        socketChannel.pipeline().addLast(new AddFriendRequestHandler(imUI));
        socketChannel.pipeline().addLast(new ObjEncoder());
    }
}
