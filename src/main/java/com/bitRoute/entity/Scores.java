package com.bitRoute.entity;

import com.mongodb.lang.NonNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Scores {

    @Id
    private String id;
    @NonNull
    @NotBlank
    @ApiModelProperty(value = "Email of the user", required = true)
    private String email;
    @ApiModelProperty(value = "computerFundamental of the user", required = true)
    private float programming;
    @ApiModelProperty(value = "OS of the user", required = true)
    private float operatingSystem;
    @ApiModelProperty(value = "cns of the user", required = true)
    private float computerNetwork;
    @ApiModelProperty(value = "dataBase of the user", required = true)
    private float softwareEngineering;
    @ApiModelProperty(value = "maths of the user", required = true)
    private float maths;
    @ApiModelProperty(value = "Programming of the user", required = true)
    private float algorithms;
    @ApiModelProperty(value = "Programming of the user", required = true)
    private float computerArchitecture;

}
