package com.isaac.cassandra.kafka.service;


import com.isaac.cassandra.kafka.model.User;
import com.isaac.cassandra.kafka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by isaac on 2017/02/10.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User user) {
        System.out.println("Persisting user"+user.getId()+ ", "+user.getName());
        return userRepository.save(user);
    }
}
