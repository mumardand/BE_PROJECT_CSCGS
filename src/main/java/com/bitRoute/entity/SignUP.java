package com.bitRoute.entity;

import com.mongodb.lang.NonNull;
import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
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
    private String email;
    @NonNull
    @NotBlank
    private String username;
    @NonNull
    @NotBlank
    private String password;
    @NonNull
    @NotBlank
    private String firstName;
    @NonNull
    @NotBlank
    private String lastName;
    private String profession;
    private Integer contact;

}
