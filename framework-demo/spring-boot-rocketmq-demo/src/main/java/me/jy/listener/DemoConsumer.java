package me.jy.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.annotation.RocketMQMessageListener;
import org.apache.rocketmq.client.apis.consumer.ConsumeResult;
import org.apache.rocketmq.client.apis.message.MessageView;
import org.apache.rocketmq.client.core.RocketMQListener;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * @author jy
 */
@Service
@RocketMQMessageListener(topic = "user-topic", consumerGroup = "rocketmq-consumer-group-demo", tag = "*", endpoints = "${rocketmq.endpoints}")
@Slf4j
public class DemoConsumer implements RocketMQListener {

    @Override
    public ConsumeResult consume(MessageView message) {
        log.info("receive message, topic:{}, messageId: {}, body: {}", message.getTopic(), message.getMessageId(), StandardCharsets.UTF_8.decode(message.getBody()));
        return ConsumeResult.SUCCESS;
    }
}
