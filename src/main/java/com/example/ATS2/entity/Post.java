package com.example.ATS2.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "post")

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name = "contact")
    private String contact;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "expiration_date")
    private Date expirationDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private Type type;

    @Column(name = "work_experience")
    private int workExperience;

    @Column(name = "department")
    private String department;

    @Column(name = "attachment")
    private Byte[] attachment;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interview_id")
    private Interview interview;


}
