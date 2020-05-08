package com.shaylee.netty.common.protocol.message;

import lombok.Data;
import lombok.EqualsAndHashCode;

import static com.shaylee.netty.common.protocol.message.command.Command.HEARTBEAT_REQUEST;

/**
 * @author pjmike
 * @create 2018-10-25 16:12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HeartbeatRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
