package com.myproject.mysmartcity.model;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
public class CityBlog {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "blog_headline")
    private String blogHeadline;

    @Column(name = "date_time")
    private ZonedDateTime dateTime;

    @Column(name = "details")
    @Lob
    private String details;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    private String price;

}
