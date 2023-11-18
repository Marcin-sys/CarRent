package com.comarch.camp.it.car.rent.db;


import com.comarch.camp.it.car.rent.model.User;

import java.util.HashMap;

public class UserRepository {
    private final HashMap <String, User> users = new HashMap<>();

    public UserRepository() {
        this.users.put("admin" , new User("admin","1d1080cc1bbc913340af0e9cc6e69dda","ADMIN"));  //admin123
        this.users.put("janusz", new User("janusz","545ac9b6355cbbed46f7a9870f40cd3f","USER")); //janusz123
        this.users.put("mateusz",new User("mateusz","d2fb22406c4eb52a33ec266b55115f50","USER")); //mateusz123
    }

    public User findByLogin(String login) {
        return this.users.get(login);
    }
}
