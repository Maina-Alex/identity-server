package com.lexDev.identityserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class AuthUser extends BaseEntity{
    private String channelId;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Channel channel;
    private String password;
    private boolean blocked;
    private boolean deleted;
    private boolean firstTimeLogin;
}
