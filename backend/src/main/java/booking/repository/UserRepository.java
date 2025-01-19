package booking.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import booking.models.User;

/**
 *
 * @author Aman
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
   public Optional<User> findUserByUuid(String uuid);
}
