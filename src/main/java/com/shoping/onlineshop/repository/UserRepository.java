package com.shoping.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoping.onlineshop.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
