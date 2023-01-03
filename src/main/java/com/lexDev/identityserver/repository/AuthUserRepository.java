package com.lexDev.identityserver.repository;

import com.lexDev.identityserver.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUser,Long> {
}
