package booking.service;

import booking.models.Role;
import booking.models.User;
import booking.models.UserNotFountException;
import booking.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aman
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRep;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    User user = new User("Aman", "Mohammad", "aman.ismail@tre.se", Role.ADMIN);
    User user2 = new User("Aman2", "Mohammad2", "aman.ismail@tre.se", Role.ADMIN);
    List<User> users = new ArrayList<User>();


    public List<User> getAllUsers() {
    	users.add(user);
    	users.add(user2);
        return users;
    }

    @SuppressWarnings("deprecation")
	public User getUserById(Long userId) {
        return userRep.getById(userId);
    }

    public User createUser(User user) {
        String rawPassword = user.getPassword();
        if(!rawPassword.isBlank()){
            user.setPassword(passwordEncoder.encode(rawPassword));
        }
        return userRep.save(user);
    }

    public Optional<User> removeUser(Long userId) {
        return userRep.findById(userId).map(u -> {
            userRep.deleteById(userId);
            return u;
        }).or(() -> {
            throw new UserNotFountException("User with ID " + userId + " not found.", new Throwable("Cause of the error"));
        });
    }
}
