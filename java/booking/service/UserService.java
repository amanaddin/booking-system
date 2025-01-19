package booking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import booking.models.User;
import booking.models.UserNotFountException;
import booking.repository.UserRepository;

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
    
    public List<User> getAllUsers() {
        return userRep.findAll();
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
