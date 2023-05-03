package com.bitRoute.entity;

import lombok.*;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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
    private List<String> options;
    private String answer;
    private String answerId;
}
