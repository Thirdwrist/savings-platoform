package com.getThirdwrist.Savings.App.User;

import org.springframework.data.repository.CrudRepository;
import com.getThirdwrist.Savings.App.User.User;


import javax.validation.constraints.NotBlank;
import java.util.Optional;

public interface UserRepository  extends CrudRepository<User, Long>{
    User findByUsername(String username);

    Optional<User> findByEmail(@NotBlank String email);

    Boolean existsByUsername(@NotBlank String username);

    Boolean existsByEmail(@NotBlank String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

}
