package com.example.ATS2.mapper;

import com.example.ATS2.dto.*;
import com.example.ATS2.entity.*;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    TypeDto typeToDto(Type type);

    Type typeToEntity(TypeDto typeDto);


    Status statusToDto(Status status);

    Status statusToEntity(StatusDto statusDto);

    PostDto postToDto(Post post);

    Post postToEntity(PostDto postDto);

    InterviewDto interviewToDto(Interview interview);
    List<InterviewDto> toInterviewDtos(List<Interview>interviews);
    Interview interviewToEntity(InterviewDto interviewDto);

    EmployeeDto employeeToDto(Employee employee);
    List<EmployeeDto> toEmployeeDtos(List<Employee>employees);
    Employee employeeToEntity(EmployeeDto employeeDto);

    CompanyDto companyDto(Company company);
    List<CompanyDto> toCompanyDtos(List<Company>companies);
    Company companyToEntity(CompanyDto companyDto);


}
