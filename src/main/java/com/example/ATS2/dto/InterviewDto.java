package com.example.ATS2.dto;

import com.example.ATS2.entity.Company;
import com.example.ATS2.entity.Post;
import com.example.ATS2.entity.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class
InterviewDto {

    private int id;
    private Date date;
    private long duration;
    private String description;
    private Company company;
    private Post posts;
    private Status status;
    //private Applicant applicants;

}
