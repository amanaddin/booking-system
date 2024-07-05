/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ismailmohammed
 */
public interface UserRepository extends JpaRepository<User, Long>{
   
}
