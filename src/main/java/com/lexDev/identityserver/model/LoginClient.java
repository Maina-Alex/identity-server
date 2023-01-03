package com.lexDev.identityserver.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginClient extends BaseEntity {
    private String username;
    private boolean deleted;

}
