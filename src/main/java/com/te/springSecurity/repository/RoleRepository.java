package com.te.springSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springSecurity.model.Role;
import com.te.springSecurity.model.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
