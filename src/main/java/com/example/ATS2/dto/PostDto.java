package com.example.ATS2.dto;

import com.example.ATS.entity.Company;
import com.example.ATS.entity.Interview;
import com.example.ATS.entity.Type;
import lombok.Data;

import java.util.Date;

@Data
public class PostDto {

    private int id;
    private String contact;
    private String jobTitle;
    private Date expirationDate;
    private Type type;
    private int workExperience;
    private String department;
    private Byte[] attachment;
    private String description;
    private String location;
    private Company company;
    private Interview interview;


}
