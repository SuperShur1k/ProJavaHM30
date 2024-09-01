package de.telran.myshop.controllers;

import de.telran.myshop.entity.User;
import de.telran.myshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null); // Возвращает null, если пользователь не найден
    }
}