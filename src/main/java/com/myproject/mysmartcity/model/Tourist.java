package com.myproject.mysmartcity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Tourist {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "passport_id")
    private String passportId;

    @Column(name = "visa")
    private String visa;

    @Column(name = "days_of_visit")
    private boolean daysOfVisit;

}
