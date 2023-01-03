package com.lexDev.identityserver.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseEntity  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Africa/Nairobi")
    private LocalDateTime createdOn;

    private boolean softDelete;

    @PrePersist
    public void persist(){
        this.createdOn= LocalDateTime.ofInstant(Instant.now(),ZoneId.of("Africa/Nairobi"));
        this.softDelete=false;
    }
}
