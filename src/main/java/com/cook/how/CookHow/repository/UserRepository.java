package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
