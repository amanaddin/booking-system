package app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author Aman
 */

@Entity
@Table (name = "clients")
public class Client extends User {
   
}
