package com.example.ATS2.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "interview")
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "duration")
    private long duration;

    @Column(name = "descripton")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post posts;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private Status status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aplikant_id")
    private Applicant applicants;

    public Interview(int id, Date date, long duration, String description, Company company, Post posts, Status status, Applicant applicants) {
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.description = description;
        this.company = company;
        this.posts = posts;
        this.status = status;
        this.applicants = applicants;
    }

    public Interview() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Post getPosts() {
        return posts;
    }

    public void setPosts(Post posts) {
        this.posts = posts;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Applicant getApplicants() {
        return applicants;
    }

    public void setApplicants(Applicant applicants) {
        this.applicants = applicants;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", date=" + date +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", company=" + company +
                ", posts=" + posts +
                ", status=" + status +
                ", applicants=" + applicants +
                '}';
    }
}
