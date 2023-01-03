package com.lexDev.identityserver.repository;

import com.lexDev.identityserver.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel,Long> {
}
