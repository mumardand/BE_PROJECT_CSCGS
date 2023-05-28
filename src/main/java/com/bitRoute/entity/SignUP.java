package com.bitRoute.entity;

import com.mongodb.lang.NonNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "SignUp")
public class SignUP {
    @Id
    @Indexed(unique=true)
    @Email(message = "Invalid email address")
    @ApiModelProperty(value = "Email of the user", required = true)
    private String email;
    @NonNull
    @NotBlank
    private String username;
    @NonNull
    @NotBlank
    @ApiModelProperty(value = "password of the user", required = true)
    private String password;
    @NonNull
    @NotBlank
    @ApiModelProperty(value = "First name of the user", required = true)
    private String firstName;
    @NonNull
    @NotBlank
    @ApiModelProperty(value = "Last name of the user", required = true)
    private String lastName;
    private String profession;
    private Integer contact;
    @Embedded
    private SubjectDetails subjectDetails;

}
