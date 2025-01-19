package booking.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import booking.models.User;

/**
 *
 * @author Aman
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
   
}
