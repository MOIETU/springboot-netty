package com.shaylee.netty.common.utils;

import com.shaylee.netty.common.protocol.protobuf.MessageBase;

import java.util.UUID;

/**
 * @author pjmike
 * @create 2018-10-27 0:35
 */
public class MessageBaseTest {
    public static void main(String[] args) {
        MessageBase.Message message = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setContent("hello world").build();
        System.out.println("message: " + message.toString());
    }
}
