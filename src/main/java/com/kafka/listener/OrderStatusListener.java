package com.kafka.listener;

import com.kafka.event.OrderStatusEvent;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderStatusListener {

    private static final Logger log = LoggerFactory.getLogger(OrderStatusListener.class);

    @KafkaListener(topics = "order-status-topic", groupId = "order-group", containerFactory = "kafkaListenerContainerFactory")
    public void listen(ConsumerRecord<String, OrderStatusEvent> record) {
        OrderStatusEvent message = record.value();
        String key = record.key();
        int partition = record.partition();
        String topic = record.topic();
        long timestamp = record.timestamp();

        log.info("Received message: {}", message);
        log.info("Key: {}; Partition: {}; Topic: {}, Timestamp: {}", key, partition, topic, timestamp);
    }
}