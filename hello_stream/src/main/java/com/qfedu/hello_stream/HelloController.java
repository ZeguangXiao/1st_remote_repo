package com.qfedu.hello_stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XZG
 * @creatTime 2022-03-26
 */
@RestController
public class HelloController {
    @Autowired
    MyMessageChannel myMessageChannel;

    @GetMapping("/hello")
    public void hello() {
        Message<String> msg = MessageBuilder.withPayload("这是一条通过 stream output 发送出来的消息").build();
        myMessageChannel.output().send(msg);
    }
}
