
package booking.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 *
 * @author Aman
 */

@Entity
@Table (name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "user_id")
    private Long UserId;
    
    @NotBlank(message = "First name is mandatory ")
    @Size (max = 50, message = "First name cannot be longer than 50 characters")
    private String firstName;
    
    @NotBlank(message = "Last name is mandatory")
    @Size(max = 50, message = "Last name cannot be longer than 50 characters")
    private String lastName;
    
    @Enumerated(EnumType.STRING)
    private Role role;
    
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandotary")
    @Column (unique = true)
    private String email;
    
    @Column(name = "password")
    private String password;
   
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    
    private String uuid;

	@UpdateTimestamp
    private LocalDateTime updatedAt;

    
    public User(String firstName, String lastName, String email, Role role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }
    
    public User(){
    }
    
    public Long getId() {
        return UserId;
    }

    public void setId(Long id) {
        this.UserId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
     public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }  
     public String getEmail(){
        return email;
    }
     
    public void setEmail(String email){
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    
     public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUuid() {
		return uuid;
	}

	public void createUuid() {
		this.uuid = UUID.randomUUID().toString();
	}
}
