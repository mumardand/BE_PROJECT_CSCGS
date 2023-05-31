package com.bitRoute.entity;

import lombok.*;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "Questions")
public class Questions {
    @Id
    private String questionId;
    private String domainId;
    private String question;
    private String Option_A;
    private String Option_B;
    private String Option_C;
    private String Option_D;
    private String answerId;
}
