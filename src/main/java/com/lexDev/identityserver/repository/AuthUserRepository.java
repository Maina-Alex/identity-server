package com.lexDev.identityserver.repository;

import com.lexDev.identityserver.model.AuthUser;
import com.lexDev.identityserver.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser,Long> {
    Optional<AuthUser> findTopByChannelAndLoginClientIdAndSoftDeleteFalse(Channel channel, long loginClientId);
}