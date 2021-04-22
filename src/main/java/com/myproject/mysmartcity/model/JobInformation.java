package com.myproject.mysmartcity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class JobInformation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "description")
    @Lob
    private String description;

    @Column(name = "place")
    @Lob
    private String place;

    @Column(name = "details")
    @Lob
    private String details;

}
