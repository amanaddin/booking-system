
package app.controller;

import app.models.Role;
import app.models.User;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismailmohammed
 */

@RestController
@RequestMapping ("/")
@Validated
public class UserController {
  
    public UserController(){}
    
    @GetMapping ("user")
    public User getUser(){
        User user = new User("", "Ismail", "sanawasie@gmail.com", Role.CLIENT);
        return user;
    }

    
    @PostMapping("create")
    public User createUser(@Valid @RequestBody User user){
      return user;
    }
    
}
