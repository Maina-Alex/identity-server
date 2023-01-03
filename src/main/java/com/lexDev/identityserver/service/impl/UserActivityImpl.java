package com.lexDev.identityserver.service.impl;

import com.lexDev.identityserver.dto.ClientDto;
import com.lexDev.identityserver.dto.PasswordDto;
import com.lexDev.identityserver.dto.UniversalResponse;
import com.lexDev.identityserver.dto.UserLoginLog;
import com.lexDev.identityserver.model.AuthUser;
import com.lexDev.identityserver.model.Channel;
import com.lexDev.identityserver.model.LoginClient;
import com.lexDev.identityserver.repository.AuthUserRepository;
import com.lexDev.identityserver.repository.ChannelRepository;
import com.lexDev.identityserver.repository.LoginClientRepository;
import com.lexDev.identityserver.service.UserActivity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserActivityImpl implements UserActivity {
    private final AuthUserRepository authUserRepository;
    private final ChannelRepository channelRepository;
    private final LoginClientRepository loginClientRepository;

    /**
     *
     * Registers users for authentication
     * Check if client already exists  by username or phone or tel
     * if user exists, check if user is registered to a channel
     * Create AuthenticationCredentials
     * @param clientDto
     * @return
     */
    @Override
    public Mono<UniversalResponse> registerUser(ClientDto clientDto) {
        return Mono.fromCallable(()-> {
            LoginClient loginClient = loginClientRepository.findClientByTelOrEmailAndSoftDeleteFalse(clientDto.tel(),clientDto.email())
                    .orElse(null);
            Channel channel = channelRepository.findChannelByChannelId(clientDto.channelId())
                    .orElse(null);
            if(channel==null){
                return UniversalResponse.builder().status(400).message("Invalid channel id").build();
            }
            if(loginClient!=null){
                boolean isLinkedToChannel= authUserRepository.findTopByChannelAndLoginClientIdAndSoftDeleteFalse(channel, loginClient.getId())
                        .isPresent();
                String message=isLinkedToChannel? "Login client already exists and is registered to Channel": "Login client already exists but is not registered to channel";
                return UniversalResponse.builder().status(400).message(message).build();
            }
            loginClient= LoginClient.builder()
                    .username(clientDto.username())
                    .deleted(false)
                    .build();
            loginClientRepository.save(loginClient);
            AuthUser authUser= AuthUser.builder()
                    .channel(channel)
                    .loginClient(loginClient)
                    .password(clientDto.password())
                    .deleted(false)
                    .blocked(false)
                    .firstTimeLogin(clientDto.firstTimeLogin())
                    .build();
            authUserRepository.save(authUser);
            log.info("Registered client {} successfully ",clientDto.username());
            return UniversalResponse.builder().status(200).message("Login client saved successfully").build();
        }).publishOn(Schedulers.boundedElastic());
    }

    /**
     *  Blocks user
     * @param clientDto
     * @return
     */
    @Override
    public Mono<UniversalResponse> blockUser(ClientDto clientDto) {
        //
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
