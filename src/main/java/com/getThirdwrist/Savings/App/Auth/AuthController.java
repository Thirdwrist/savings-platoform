package com.getThirdwrist.Savings.App.Auth;


import com.getThirdwrist.Savings.App.User.User;
import com.getThirdwrist.Savings.App.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;



@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    public UserRepository userRepository;

    public PasswordEncoder passwordEncoder;

    @PostMapping("/signup")
    public ResponseEntity<User> create(@Valid @RequestBody User user, HttpServletRequest req)
        throws ServletRequestBindingException
    {
        this.passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        if(Boolean.TRUE.equals(userRepository.existsByEmail(user.getEmail())))
        {
            throw new ServletRequestBindingException("email already exists");
        }

        if(Boolean.TRUE.equals(userRepository.existsByUsername(user.getUsername())))
        {
            throw new ServletRequestBindingException("username already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/users/{userId}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).body(savedUser);
       }


}
