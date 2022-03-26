package com.qfedu.hello_stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author XZG
 * @creatTime 2022-03-26
 */
public interface MyMessageChannel {
     String  MY_MSG_INPUT = "my_msg_input";
     String  MY_MSG_OUTPUT = "my_msg_output";

     @Output(MY_MSG_OUTPUT)
//     一个消息输出通道，什么是输出通道呢？其实就是消息发送通道。
    MessageChannel output();

     @Input(MY_MSG_INPUT)
//     一个消息输入通道，所谓的消息输入通道就是消息接收通道。
    SubscribableChannel input();



}
