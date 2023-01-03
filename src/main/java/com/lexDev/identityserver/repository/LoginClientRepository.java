package com.lexDev.identityserver.repository;

import com.lexDev.identityserver.model.LoginClient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginClientRepository extends JpaRepository<LoginClient,Long> {
    Optional<LoginClient> findClientByTelOrEmailAndSoftDeleteFalse(String tel, String email);
}
