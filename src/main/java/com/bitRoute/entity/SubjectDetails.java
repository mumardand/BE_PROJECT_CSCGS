package com.bitRoute.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
@Data
public class SubjectDetails {

    private String subject1;
    private String subject2;
}
