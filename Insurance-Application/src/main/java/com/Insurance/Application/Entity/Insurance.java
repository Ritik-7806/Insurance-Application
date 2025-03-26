package com.Insurance.Application.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Insurance {

    private String name;
    private Double price;
    private String description;
    @Id
    private String id;






}
