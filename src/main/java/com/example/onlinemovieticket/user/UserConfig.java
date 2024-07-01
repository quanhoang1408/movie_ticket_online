package com.example.onlinemovieticket.user;

import com.example.onlinemovieticket.role.Role;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (userRepository.findByEmail("admin@gmail.com").isPresent()) {
            return;
        }
        userRepository.save(new User(
                "admin",
                "admin",
                "Hoang Minh Quan",
                "admin@gmail.com",
                "09129000000",
                Role.ROLE_ADMIN)
        );
    }
}
