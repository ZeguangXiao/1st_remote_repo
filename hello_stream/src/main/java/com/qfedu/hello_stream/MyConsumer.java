package com.qfedu.hello_stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @author XZG
 * @creatTime 2022-03-26
 */
@Component
@EnableBinding(Sink.class)
public class MyConsumer {

    @StreamListener(Sink.INPUT)
    public void consume(String msg){
        System.out.println("msg = " + msg);
    }
}
