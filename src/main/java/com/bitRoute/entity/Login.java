package com.bitRoute.entity;

import lombok.*;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Login {
    @Id
    private String username;
    private String password;
}
