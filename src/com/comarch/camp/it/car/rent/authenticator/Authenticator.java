package com.comarch.camp.it.car.rent.authenticator;

import com.comarch.camp.it.car.rent.db.UserRepository;
import com.comarch.camp.it.car.rent.model.User;
import org.apache.commons.codec.digest.DigestUtils;

public class Authenticator {

    final private String seed = "hq_6#%r8rPJ)zoZaIvV6X@HqMVaz;C7wNM39Rl]{hCE!YF]8Xo";

    private final UserRepository userRepository = new UserRepository();

    public boolean authenticator(String login, String password) {
        User user = this.userRepository.findByLogin(login);

        return user != null && user.getPassword().equals(
                DigestUtils.md5Hex(password + this.seed));
    }
}
