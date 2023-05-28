package com.bitRoute.entity;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value = "Email of the user", required = true)
    private String email;
    @ApiModelProperty(value = "Password of the user", required = true)
    private String password;
}
