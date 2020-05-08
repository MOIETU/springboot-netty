package com.shaylee.netty.client.controller;

import com.shaylee.netty.client.config.NettyClient;
import com.shaylee.netty.common.protocol.protobuf.MessageBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author pjmike
 * @create 2018-10-24 16:47
 */
@RestController
public class ConsumerController {
    @Autowired
    private NettyClient nettyClient;

    @RequestMapping("/send")
    public String send(@RequestParam String content) {
        MessageBase.Message message = new MessageBase.Message()
                .toBuilder().setCmd(MessageBase.Message.CommandType.NORMAL)
                .setContent(content)
                .setRequestId(UUID.randomUUID().toString()).build();
        nettyClient.sendMsg(message);
        return "send ok";
    }
}
