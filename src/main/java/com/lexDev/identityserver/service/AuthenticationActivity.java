package com.lexDev.identityserver.service;

import com.lexDev.identityserver.dto.AuthenticationPayload;
import com.lexDev.identityserver.dto.LogOutDto;
import com.lexDev.identityserver.dto.TokenValidationDto;
import com.lexDev.identityserver.dto.UniversalResponse;
import reactor.core.publisher.Mono;

public interface AuthenticationActivity {
    Mono<UniversalResponse> authenticate(AuthenticationPayload authenticationPayload);
    Mono<UniversalResponse> validateToken(TokenValidationDto tokenValidationDto);
    Mono<UniversalResponse> logoutUser(LogOutDto logOutDto);
}
