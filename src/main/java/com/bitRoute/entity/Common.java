package com.bitRoute.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "Common")
public class Common {
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

