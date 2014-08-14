package com.tieto.it2014.dao.user.command;

import com.tieto.it2014.domain.user.command.DeleteUserCommand;
import com.tieto.it2014.domain.user.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DeleteUserCommandDaoJpa implements DeleteUserCommand.Dao {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void execute(User user) {
//        repository.delete(user.id);

    }

}
