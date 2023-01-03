package com.lexDev.identityserver.service.impl;

import com.lexDev.identityserver.dto.ChannelDto;
import com.lexDev.identityserver.dto.PageableDto;
import com.lexDev.identityserver.dto.UniversalResponse;
import com.lexDev.identityserver.service.ChannelActivity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ChannelActivityImpl implements ChannelActivity {
    @Override
    public Mono<UniversalResponse> registerChannel(ChannelDto channelDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> disableChannel(ChannelDto channelDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> deleteChannel(ChannelDto channelDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> enableChannel(ChannelDto channelDto) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> getChannel(PageableDto pageableDto) {
        return null;
    }
}
