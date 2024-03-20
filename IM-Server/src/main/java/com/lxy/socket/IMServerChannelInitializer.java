package com.lxy.socket;
import com.lxy.protocolpackage.codec.ObjDecoder;
import com.lxy.protocolpackage.codec.ObjEncoder;
import com.lxy.socket.handler.impl.LoginHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.logging.LoggingHandler;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class IMServerChannelInitializer extends ChannelInitializer<SocketChannel> {


    @Resource
    private ApplicationContext applicationContext;

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(new ObjDecoder());
        socketChannel.pipeline().addLast(applicationContext.getBean(LoginHandler.class));
        socketChannel.pipeline().addLast(new ObjEncoder());
    }
}
