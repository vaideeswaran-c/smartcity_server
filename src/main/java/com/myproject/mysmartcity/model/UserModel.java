package com.myproject.mysmartcity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "admin_status")
    private String adminStatus;

    @Column(name = "citizen_id")
    private String citizenId;

    @Column(name = "address")
    private String address;

    @Column(name = "sms_enabled")
    private boolean smsEnabled;

    @Column(name = "passport_id")
    private String passportId;

    @Column(name = "visa")
    private String visa;

    @Column(name = "days_of_visit")
    private boolean daysOfVisit;

}
