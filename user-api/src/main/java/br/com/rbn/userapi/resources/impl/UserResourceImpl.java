package br.com.rbn.userapi.resources.impl;

import br.com.rbn.userapi.domain.User;
import br.com.rbn.userapi.resources.UserResource;
import br.com.rbn.userapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource {

    private final UserService userService;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findById() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}
