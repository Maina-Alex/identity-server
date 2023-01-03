package com.lexDev.identityserver.service;

import com.lexDev.identityserver.dto.ClientDto;
import com.lexDev.identityserver.dto.PasswordDto;
import com.lexDev.identityserver.dto.UniversalResponse;
import com.lexDev.identityserver.dto.UserLoginLog;
import reactor.core.publisher.Mono;

public interface UserActivity {
    Mono<UniversalResponse> registerUser(ClientDto clientDto);

    Mono<UniversalResponse> blockUser(ClientDto clientDto);

    Mono<UniversalResponse> unblockUser(ClientDto clientDto);

    Mono<UniversalResponse> deleteUser(ClientDto clientDto);

    Mono<UniversalResponse> getUserAuthenticationLog(UserLoginLog userLoginLog);

    Mono<UniversalResponse> resetUserPassword(PasswordDto passwordDto);

    Mono<UniversalResponse> updateUserPassword(PasswordDto passwordDto);
}
