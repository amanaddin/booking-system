package booking.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import booking.models.User;
import booking.rest.dto.UserDTOMapper;
import booking.rest.dto.UserLimitedDTO;
import booking.service.UserService;
import jakarta.validation.Valid;

/**
 *
 * @author ismailmohammed
 */
@RestController
@RequestMapping("/")
@Validated
public class UserController {


    private UserService service;
    private UserDTOMapper userMapper;
    

    @Autowired
    public UserController(UserService service, UserDTOMapper userMapper) {
    	this.service = service;
    	this.userMapper = userMapper;
    	
    }

    @GetMapping("/users")
    public List<UserLimitedDTO> getUser() {
        return userMapper.limitedUserList(service.getAllUsers());
    }

    @PostMapping("/create")
    public User createUser(@Valid @RequestBody User user) {
        return service.createUser(user);
    }
    
    @GetMapping
    public UserLimitedDTO getUserById(@RequestHeader Long id) {
    	return userMapper.limitedUser(service.getUserById(id));
    }

    @DeleteMapping("/user/{id}")
    public Optional<User> removeUser(@PathVariable Long id) {
        return service.removeUser(id);
    }

    
}
