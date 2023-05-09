package com.bitRoute.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Scores {

    @Id
    private String id;
    private float computerFundamental;
    private float os;
    private float cns;
    private float dataBase;
    private float maths;

}
