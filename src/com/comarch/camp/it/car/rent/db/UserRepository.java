package com.comarch.camp.it.car.rent.db;


import com.comarch.camp.it.car.rent.model.User;

public class UserRepository {
    private final User[] users = new User[3];

    public UserRepository() {
        this.users[0] = new User("admin","0192023a7bbd73250516f069df18b500");  //admin123
        this.users[1] = new User("janusz","1e6f2ac43951a6721d3d26a379cc7f8b"); //janusz123
        this.users[2] = new User("mateusz","8385f273189d4ebbb0a362368c81f7a6"); //mateusz123
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
