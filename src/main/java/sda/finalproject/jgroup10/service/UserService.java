package sda.finalproject.jgroup10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.finalproject.jgroup10.model.User;
import sda.finalproject.jgroup10.repository.UserRepository;

@Component
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        if (id == 13) {
            throw new RuntimeException("13 is not allowed");
        }
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}