package com.isaac.cassandra.kafka.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.util.UUID;

/**
 * Created by isaac on 2017/02/10.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(value = "User")
public class User {

    @PrimaryKey("USER_ID")
    private UUID id;
    @Column("NAME")
    private String name;
    @Column("SURNAME")
    private String surname;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {

        return "User{id: " + getId() + ", name: " + getName() + ", surname: " + getSurname() + "}";
    }
}
