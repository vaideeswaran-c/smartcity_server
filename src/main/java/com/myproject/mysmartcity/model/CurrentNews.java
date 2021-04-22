package com.myproject.mysmartcity.model;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
public class CurrentNews {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "news_headline")
    private String newsHeadline;

    @Column(name = "date_time")
    private String dateTime;

    @Column(name = "details")
    @Lob
    private String details;

    @Column(name = "image")
    private String image;

}
