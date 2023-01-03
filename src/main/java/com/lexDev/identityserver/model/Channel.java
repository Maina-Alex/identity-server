package com.lexDev.identityserver.model;

import com.lexDev.identityserver.constant.UsernameType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class Channel extends BaseEntity{
    private String channelId;
    private String channelSecret;
    /**
     * Access Token validity in seconds
     */
    private int accessTokenValidity;
    private int refreshTokenValidity;
    private int firstTimeLoginTokenValidity;
    @Enumerated(EnumType.STRING)
    private UsernameType usernameType;
    @ManyToOne
    private Channel sharedChannel;
    private boolean canValidateToken=false;
    private boolean canRegisterUser=false;
}
