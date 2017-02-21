package com.isaac.cassandra.kafka.repository;


import com.isaac.cassandra.kafka.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by isaac on 2017/02/10.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
