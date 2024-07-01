package com.example.onlinemovieticket.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public UserDetails loadUserByUserEmail(String userEmail) {
        return userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
