package com.lexDev.identityserver.repository;

import com.lexDev.identityserver.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
