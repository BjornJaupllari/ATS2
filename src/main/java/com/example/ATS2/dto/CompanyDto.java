package com.example.ATS2.dto;


import com.example.ATS2.entity.Employee;
import com.example.ATS2.entity.Interview;
import com.example.ATS2.entity.Post;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDto {

    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String website;
    private String logo;
    private String email;
    private String password;
    private Post post;
    private Employee employee;
    private Interview interview;

}
