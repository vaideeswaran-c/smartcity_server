package com.myproject.mysmartcity.model;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
public class AboutPage {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "menu")
    @Lob
    private String menu;

    @Column(name = "population")
    private String population;

    @Column(name = "current_major_topics")
    @Lob
    private String currentMajorTopics;

    @Column(name = "contact")
    private String contact;

}
