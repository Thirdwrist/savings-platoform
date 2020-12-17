package com.getThirdwrist.Savings.App.User;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping
    public Iterable<User> index()
            throws  JsonProcessingException
    {
        return userRepository.findAll();
    }

    @GetMapping("{id}")
     public Optional<User> update(@PathVariable Long id, Authentication auth){

        return userRepository.findById(id);
    }

    @GetMapping("me")
    public User me(Authentication auth)
    {
        String username = auth.getPrincipal().toString();
        return userRepository.findByUsername(username);
    }

    @PutMapping("{id}")
    public User update(@RequestBody User user, @PathVariable Long id)
    {
        Optional<User> userResult =  userRepository.findById(id);
        userResult.orElseGet(User::new).setName(user.getName());

        return userResult.orElseGet(User::new);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id)
    {
        userRepository.deleteById(id);
    }
}
