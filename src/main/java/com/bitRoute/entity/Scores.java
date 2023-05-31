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
    private float program;
    @ApiModelProperty(value = "OS of the user", required = true)
    private float OS;
    @ApiModelProperty(value = "cns of the user", required = true)
    private float CN;
    @ApiModelProperty(value = "dataBase of the user", required = true)
    private float SE;
    @ApiModelProperty(value = "maths of the user", required = true)
    private float maths;
    @ApiModelProperty(value = "algorithms of the user", required = true)
    private float algo;
    @ApiModelProperty(value = "Programming of the user", required = true)
    private float CA;

}
