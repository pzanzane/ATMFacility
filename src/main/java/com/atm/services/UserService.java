package com.atm.services;

import com.atm.entities.User;
import com.atm.errors.SignupException;
import com.atm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) throws SignupException {

        if (userRepository.existsByUsername(user.getUsername())) {
            throw new SignupException("Username already exist.");
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new SignupException("Email already exist.");
        }

        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
