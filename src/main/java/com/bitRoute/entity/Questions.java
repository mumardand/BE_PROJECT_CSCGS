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
    @ElementCollection
    private List<Answers> options;
    private String answerId;
}
