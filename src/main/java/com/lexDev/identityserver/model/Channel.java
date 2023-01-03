package com.lexDev.identityserver.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class Channel extends BaseEntity{
    /**
     * -  id: long
     *       - channelId : String
     *       - channelSecret : String
     *       - channelAccessTokenValidity : Integer
     *       - channelRefreshTokenValidity : Integer
     *       - firstTimeLoginTokenValidity : Integer
     *       - parentChannel : Channel
     *       - canValidateToken: boolean
     *       - usernameType: UsernameType
     */
    private long id
}
