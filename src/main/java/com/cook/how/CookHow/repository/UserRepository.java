package com.cook.how.CookHow.repository;

import com.junicab.cookhow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
