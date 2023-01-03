package com.lexDev.identityserver.service.impl;

import com.lexDev.identityserver.dto.ClientDto;
import com.lexDev.identityserver.dto.PasswordDto;
import com.lexDev.identityserver.dto.UniversalResponse;
import com.lexDev.identityserver.dto.UserLoginLog;
import com.lexDev.identityserver.service.UserActivity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserActivityImpl implements UserActivity {
    @Override
    public Mono<UniversalResponse> registerUser(ClientDto clientDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> blockUser(ClientDto clientDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> unblockUser(ClientDto clientDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> deleteUser(ClientDto clientDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> getUserAuthenticationLog(UserLoginLog userLoginLog) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> resetUserPassword(PasswordDto passwordDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> updateUserPassword(PasswordDto passwordDto) {
        return null;
    }
}
