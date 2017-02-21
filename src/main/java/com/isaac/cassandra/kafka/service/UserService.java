package com.isaac.cassandra.kafka.service;


import com.isaac.cassandra.kafka.model.User;

/**
 * Created by isaac on 2017/02/10.
 */
public interface UserService {

    User createUser(User user);
}
