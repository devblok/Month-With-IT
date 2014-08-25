package com.tieto.it2014.domain.user.query;

import com.tieto.it2014.domain.DomainException;
import com.tieto.it2014.domain.Util.Hash;
import com.tieto.it2014.domain.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class LoggedInUserQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private Dao dao;

    private User user;

    public interface Dao extends Serializable {

        User result(String email);
    }

    public User result(String email, String password) {
        user = dao.result(email);

        if (user == null) {
            throw new DomainException("Incorrect User Name/Password");
        }

        password = Hash.sha256(password);

        if (user.password.equals(password)) {
            return user;
        } else {
            throw new DomainException("Incorrect User Name/Password");
        }
    }

}
