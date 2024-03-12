package com.shoping.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoping.onlineshop.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
