package com.isaac.cassandra.kafka.config;

/**
 * Created by isaac on 2017/02/11.
 */
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;

public class Listener {

    @KafkaListener(id = "id0", topicPartitions = { @TopicPartition(topic = "SpringKafkaTopic", partitions = { "0" }) })
    public void listenPartition0(ConsumerRecord<?, ?> record) {
        System.out.println("Listener Id0, Thread ID: " + Thread.currentThread().getId());
        System.out.println("Received: " + record);
    }

    @KafkaListener(id = "id1", topicPartitions = { @TopicPartition(topic = "SpringKafkaTopic", partitions = { "1" }) })
    public void listenPartition1(ConsumerRecord<?, ?> record) {
        System.out.println("Listener Id1, Thread ID: " + Thread.currentThread().getId());
        System.out.println("Received: " + record);

    }

    @KafkaListener(id = "id2", topicPartitions = { @TopicPartition(topic = "SpringKafkaTopic", partitions = { "2" }) })
    public void listenPartition2(ConsumerRecord<?, ?> record) {
        System.out.println("Listener Id2, Thread ID: " + Thread.currentThread().getId());
        System.out.println("Received: " + record);
    }
}
