package com.getThirdwrist.Savings.App.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping("/")
    public Iterable<User> index()
    {
        return userRepository.findAll();
    }

    @GetMapping("{user}")
     public Optional<User> update(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @PostMapping("users")
    public User store(@Valid @RequestBody User user)
    {
        return userRepository.save(user);
    }

    @PutMapping("{id}")
    public User update(@RequestBody User user, @PathVariable Long id)
    {
        Optional<User> userResult =  userRepository.findById(id);
        return userResult.orElseGet(User::new);
    }

    @DeleteMapping("{user}")
    void delete(@PathVariable Long id)
    {
        userRepository.deleteById(id);
    }
}
