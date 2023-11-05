package com.comarch.camp.it.car.rent.db;


import com.comarch.camp.it.car.rent.model.User;

public class UserRepository {
    private final User[] users = new User[3];

    public UserRepository() {
        this.users[0] = new User("admin","1d1080cc1bbc913340af0e9cc6e69dda");  //admin123
        this.users[1] = new User("janusz","545ac9b6355cbbed46f7a9870f40cd3f"); //janusz123
        this.users[2] = new User("mateusz","d2fb22406c4eb52a33ec266b55115f50"); //mateusz123
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
