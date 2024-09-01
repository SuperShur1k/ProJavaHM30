package de.telran.myshop.repository;

import de.telran.myshop.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
