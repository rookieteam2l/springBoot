/*
package com.sunshine.free.rabbitMQ.listener;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

*/
/**
 * @author : Free
 * @Date : Create in  2020-1-10
 * @Description:
 * @Modified By:
 * @Version:
 *//*

@Component
public class FanoutSmsConsumer {

    @RabbitListener(queues = "test_queue")
    public void consumeMessage(Message message) throws Exception{
        String msg = new String(message.getBody(), "UTF-8");
        JSONObject jsonObject = JSONObject.parseObject(msg);
        System.out.println("消费消息：" + jsonObject);
    }
}
*/
