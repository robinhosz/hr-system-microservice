package br.com.rbn.userapi.service;

import br.com.rbn.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
