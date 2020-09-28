package com.getThirdwrist.Savings.App.User;

import org.springframework.data.repository.CrudRepository;
import com.getThirdwrist.Savings.App.User.User;


import java.util.Optional;

public interface UserRepository  extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
