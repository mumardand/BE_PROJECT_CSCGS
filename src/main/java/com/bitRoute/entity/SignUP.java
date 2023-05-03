package com.bitRoute.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUP {
    @Id
    private String username;
    private String password;
}
