package com.example.ATS2.mapper;

import com.example.ATS2.dto.*;
import com.example.ATS2.entity.*;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    TypeDto typeToDto(Type type);
    List<TypeDto> toTypeDtos(List<Type>types);
    Type typeToEntity(TypeDto typeDto);


    StatusDto statusToDto(Status status);
    List<StatusDto> toStatusDtos(List<Status>statuses);
    Status statusToEntity(StatusDto statusDto);

    PostDto postToDto(Post post);
    List<PostDto> toPostDtos(List<Post>posts);
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
