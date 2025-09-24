package jwd.pos.features.auth.repository;

import jwd.pos.model.entity.User;

public interface AuthRepo {

    User findUserByName(String name);
}
