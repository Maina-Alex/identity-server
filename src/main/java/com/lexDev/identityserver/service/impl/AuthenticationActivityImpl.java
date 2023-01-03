package com.lexDev.identityserver.service.impl;

import com.lexDev.identityserver.dto.AuthenticationPayload;
import com.lexDev.identityserver.dto.LogOutDto;
import com.lexDev.identityserver.dto.TokenValidationDto;
import com.lexDev.identityserver.dto.UniversalResponse;
import com.lexDev.identityserver.service.AuthenticationActivity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AuthenticationActivityImpl  implements AuthenticationActivity {
    @Override
    public Mono<UniversalResponse> authenticate(AuthenticationPayload authenticationPayload) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> validateToken(TokenValidationDto tokenValidationDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> logoutUser(LogOutDto logOutDto) {
        return null;
    }
}
