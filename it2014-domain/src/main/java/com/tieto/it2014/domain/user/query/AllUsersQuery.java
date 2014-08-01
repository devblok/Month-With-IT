package com.tieto.it2014.domain.user.query;

import com.tieto.it2014.domain.user.entity.User;
import java.io.Serializable;
import java.util.List;

public class AllUsersQuery implements Serializable {
  private static final long serialVersionUID = 1L;
  private final Dao dao;

  public interface Dao extends Serializable {
    List<User> result();
  }

  public AllUsersQuery(Dao dao) {
    this.dao = dao;
  }

  public List<User> result() {
    return dao.result();
  }
}
