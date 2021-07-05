package com.example.ATS2.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "website")
    private String website;

    @Column(name = "logo")
    private byte[] logo;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private List<Post> posts;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private List<Employee> employees;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private List<Interview> interviews;


    public Company(int id, String name, String address, long phoneNumber, String website, String logo, String email, String password, List<Post> posts, List<Employee> employees, List<Interview> interviews) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.website = website;
//        this.logo = logo;
        this.email = email;
        this.password = password;
        this.posts = posts;
        this.employees = employees;
        this.interviews = interviews;
    }

    public Company() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", website='" + website + '\'' +
                ", logo='" + logo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", posts=" + posts +
                ", employees=" + employees +
                ", interviews=" + interviews +
                '}';
    }
}
