package com.example.ATS2.dto;

import com.example.ATS.entity.Company;
import com.example.ATS.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {

    private int id;
    private Company company;
    private User user;

}
