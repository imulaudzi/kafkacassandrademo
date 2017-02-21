package com.isaac.cassandra.kafka.config;

/**
 * Created by isaac on 2017/02/11.
 */

import com.isaac.cassandra.kafka.model.User;
import com.isaac.cassandra.kafka.service.UserService;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class Listener {

    @Autowired
    private UserService userService;

    @KafkaListener(id = "id0", topicPartitions = {@TopicPartition(topic = "isaac", partitions = {"0"})})
    public void listenPartition0(ConsumerRecord<String, GenericRecord> record) {
        System.out.println("Listener Id0, Thread ID: " + Thread.currentThread().getId());
        System.out.println("Received: " + record);
        User user = new User();
        user.setName(record.value().get("name").toString());
        user.setSurname(record.value().get("surname").toString());
        user.setId(UUID.randomUUID());
        System.out.println("Received: " + user.getName() + ", " + user.getSurname() + ", " + user.getId());
        userService.createUser(user);
    }

    @KafkaListener(id = "id1", topicPartitions = {@TopicPartition(topic = "isaac", partitions = {"1"})})
    public void listenPartition1(ConsumerRecord<String, GenericRecord> record) {
        System.out.println("Listener Id1, Thread ID: " + Thread.currentThread().getId());
        System.out.println("Received: " + record);
        User user = new User();
        user.setName(record.value().get("name").toString());
        user.setSurname(record.value().get("surname").toString());
        user.setId(UUID.randomUUID());
        System.out.println("Received: " + user.getName() + ", " + user.getSurname() + ", " + user.getId());
        userService.createUser(user);
    }
}
