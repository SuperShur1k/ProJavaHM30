package de.telran.myshop.repository;

import de.telran.myshop.entity.UserDetail;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailRepository extends CrudRepository<UserDetail, Long> {
}
