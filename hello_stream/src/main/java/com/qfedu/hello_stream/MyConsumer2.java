package com.qfedu.hello_stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author XZG
 * @creatTime 2022-03-26
 */
@Component
@EnableBinding(MyMessageChannel.class)
public class MyConsumer2 {

    @StreamListener(MyMessageChannel.MY_MSG_INPUT)
    public void consume(String msg){
        System.out.println("msg = " + msg);
    }
}
