package com.lexDev.identityserver.dto;

import lombok.Builder;

public record ClientDto(String preferredName, String email, String username, String channelId, String tel, String password,boolean firstTimeLogin, boolean deleted) {
    @Builder public ClientDto {}
}

