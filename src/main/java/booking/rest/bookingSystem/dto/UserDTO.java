package booking.rest.bookingSystem.dto;

import booking.models.Role;
import booking.models.Role;

/**
 *
 * @author Aman
 */
public class UserDTO {

    private String name, lastName, email;
    private Role role;
    private Long userId;
    
    public UserDTO(String name, String lastName, String email, Role role, Long userId) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
