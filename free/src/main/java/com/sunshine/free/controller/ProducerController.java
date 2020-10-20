/*
package com.sunshine.free.controller;

import com.sunshine.free.rabbitMQ.producer.TestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

*/
/**
 * @author : Free
 * @Date : Create in  2020-1-10
 * @Description: rabbitMQ 测试
 * @Modified By:
 * @Version:
 *//*

@RestController
public class ProducerController {

    @Autowired
    private TestProducer TestProducer;
    @RequestMapping("/sendMsg")
    public String sendFanout() {
        for(int i=0; i<10; i++){
            TestProducer.send("test_queue");
        }
        return "success";
    }

}
*/
