package com.comarch.camp.it.car.rent.db;


import com.comarch.camp.it.car.rent.model.User;

public class UserRepository {
    private final User[] users = new User[3];

    public UserRepository() {
        this.users[0] = new User("admin","admin123");
        this.users[1] = new User("janusz","janusz123");
        this.users[2] = new User("mateusz","mateusz123");
    }

    public User findByLogin(String login) {
        for ( User user : this.users){
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }
}