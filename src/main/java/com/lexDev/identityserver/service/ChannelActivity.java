package com.lexDev.identityserver.service;

import com.lexDev.identityserver.dto.ChannelDto;
import com.lexDev.identityserver.dto.PageableDto;
import com.lexDev.identityserver.dto.UniversalResponse;
import reactor.core.publisher.Mono;

public interface ChannelActivity {
    Mono<UniversalResponse> registerChannel(ChannelDto channelDto);
    Mono<UniversalResponse> disableChannel(ChannelDto channelDto);
    Mono<UniversalResponse> deleteChannel(ChannelDto channelDto);
    Mono<UniversalResponse> enableChannel(ChannelDto channelDto);
    Mono<UniversalResponse> getChannel(PageableDto pageableDto);
}
