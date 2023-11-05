package com.comarch.camp.it.car.rent.authenticator;

import com.comarch.camp.it.car.rent.db.UserRepository;
import com.comarch.camp.it.car.rent.model.User;

public class Authenticator {

    private final UserRepository userRepository = new UserRepository();

    public boolean authenticator(String login, String password) {
        User user = this.userRepository.findByLogin(login);

        return user != null && user.getPassword().equals(password);

    }
}