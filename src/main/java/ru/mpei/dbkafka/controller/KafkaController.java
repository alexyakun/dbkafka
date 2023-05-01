package ru.mpei.dbkafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mpei.dbkafka.produser.TopicProducer;

@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
@RestController
public class KafkaController {
    
    private final TopicProducer topicProducer;
    
    @PostMapping
    public void send(String msg){
        System.out.println(msg);
        topicProducer.send(msg);
    }
}
