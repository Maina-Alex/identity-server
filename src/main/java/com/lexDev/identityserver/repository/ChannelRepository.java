package com.lexDev.identityserver.repository;

import com.lexDev.identityserver.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChannelRepository extends JpaRepository<Channel,Long> {
    Optional<Channel> findChannelByChannelId(String channelId);
}
