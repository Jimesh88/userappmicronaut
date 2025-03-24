package com.example.service;

import com.example.dao.UserRepository;
import com.example.exception.UserNotFoundException;
import com.example.model.User;
import jakarta.inject.Singleton;

@Singleton
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("User with id %s not found".formatted(id)));
    }

    public User updateUser(Long id, User userDetails) {
        User existingUser = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User with id %s not found".formatted(id)));
        existingUser.setName(userDetails.getName());
        existingUser.setEmail(userDetails.getEmail());
        existingUser.setAge(userDetails.getAge());
        return userRepository.update(existingUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
