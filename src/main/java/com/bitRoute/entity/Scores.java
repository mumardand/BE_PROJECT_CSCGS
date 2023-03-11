package com.bitRoute.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long scoreId;
    private float ComputerFundamental;
    private float os;
    private float cns;
    private float dataBase;
    private float maths;

}
