package booking.rest.bookingSystem.controller;

import booking.models.User;
import booking.service.UserService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismailmohammed
 */
@RestController
@RequestMapping("/")
@Validated
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("users")
    public List<User> getUser() {
        return service.getAllUsers();
    }

    @PostMapping("create")
    public User createUser(@Valid @RequestBody User user) {
        return service.createUser(user);
    }

    @DeleteMapping("/user/{id}")
    public Optional<User> removeUser(@PathVariable Long id) {
        return service.removeUser(id);
    }

}
