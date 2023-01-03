package com.lexDev.identityserver.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends BaseEntity {
    private String preferredName;
    private String email;
    private String tel;
    private String username;
    private boolean deleted;

}
