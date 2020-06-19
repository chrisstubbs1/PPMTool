package com.chrisstubbs.ppm.domain;

import lombok.Generated;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Project {
    @Id
    @GeneratedValue
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date startDate;
    private Date endDate;

    private Date createdAt;
    private Date updatedAt;

    public Project() {
    }

    
}
