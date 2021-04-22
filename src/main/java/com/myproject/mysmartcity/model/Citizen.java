package com.myproject.mysmartcity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Citizen {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "citizen_id")
    private String citizenId;

    @Column(name = "address")
    @Lob
    private String address;

    @Column(name = "sms_enabled")
    private boolean smsEnabled;

}
