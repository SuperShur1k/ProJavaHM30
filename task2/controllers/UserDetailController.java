package de.telran.myshop.controllers;


import de.telran.myshop.entity.User;
import de.telran.myshop.entity.UserDetail;
import de.telran.myshop.repository.UserDetailRepository;
import de.telran.myshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user-details")
public class UserDetailController {

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/{userId}")
    public UserDetail createUserDetail(@PathVariable Long userId, @RequestBody UserDetail userDetail) {
        // Найти пользователя по его ID
        Optional<User> userOptional = userRepository.findById(userId);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            userDetail.setUser(user);
            return userDetailRepository.save(userDetail);
        } else {
            throw new RuntimeException("User not found with ID: " + userId);
        }
    }

    @GetMapping("/{id}")
    public UserDetail getUserDetailById(@PathVariable Long id) {
        return userDetailRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("UserDetail not found with ID: " + id));
    }
}
