package com.example.ATS2.service;

import com.example.ATS2.entity.Company;
import com.example.ATS2.entity.Employee;
import com.example.ATS2.repository.CompanyRepository;
import com.example.ATS2.repository.EmployRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@NoArgsConstructor

public class EmployeeService {

    private EmployRepository employRepository;


    // getall
    public List<Employee> getAll(){
        return employRepository.findAll();
    }
    //GetCompByd

    public Optional<Employee> findById(int id){
        return employRepository.findById(id);
    }
    //save
    public Employee save(@RequestBody Employee employee){
        return employRepository.save(employee);
    }
    //delete
    public void deleteById(int id){
        employRepository.deleteById(id);
    }


}
