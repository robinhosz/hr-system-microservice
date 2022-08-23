package br.com.rbn.userapi.service.impl;

import br.com.rbn.userapi.domain.User;
import br.com.rbn.userapi.repository.UserRepository;
import br.com.rbn.userapi.service.UserService;
import br.com.rbn.userapi.service.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado com o id: " + id));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
