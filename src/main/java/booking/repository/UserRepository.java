
package booking.repository;

import booking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aman
 */
public interface UserRepository extends JpaRepository<User, Long>{
   
}
