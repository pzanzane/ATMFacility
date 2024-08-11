package com.atm.services;

import com.atm.entities.User;
import com.atm.errors.SignupException;
import com.atm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(final UserRepository userRepository,
                       final PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(User user) throws SignupException {

        if (userRepository.existsByUsername(user.getUsername())) {
            throw new SignupException("Username already exist.");
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new SignupException("Email already exist.");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }
}
