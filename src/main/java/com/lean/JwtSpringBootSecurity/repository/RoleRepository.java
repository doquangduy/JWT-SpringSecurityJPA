package com.lean.JwtSpringBootSecurity.repository;

import com.lean.JwtSpringBootSecurity.model.Role;
import com.lean.JwtSpringBootSecurity.constants.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
    Optional<Role> findByName(RoleName roleName);
}
