package com.lexDev.identityserver.dto;

import lombok.Builder;

public record UniversalResponse(int status, String message, Object data) {
    @Builder public UniversalResponse {}
}
