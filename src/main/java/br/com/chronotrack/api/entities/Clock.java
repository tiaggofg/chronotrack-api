package br.com.chronotrack.api.entities;

import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.Date;

@MongoEntity(collection = "clock")
public class Clock {

    private String userId;
    private String username;
    private Date date;
    private Registry registry;

    public Clock() {
    }

    public Clock(String userId, String username, Date date, Registry registry) {
        this.userId = userId;
        this.username = username;
        this.date = date;
        this.registry = registry;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }
}
