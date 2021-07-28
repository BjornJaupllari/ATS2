package com.example.ATS2.service;

import com.example.ATS2.entity.Company;
import com.example.ATS2.execption.UserNotFoundExeption;
import com.example.ATS2.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class CompanyServices {


    private  CompanyRepository companyRepository;


// getall
    public List<Company> getAllCompany(){
        return companyRepository.findAll();
    }
    //GetCompByd

    public Optional<Company>findById(int id){
        return companyRepository.findById(id);
    }
//save
    public Company saveCompany(@RequestBody Company company){
        return companyRepository.save(company);
    }
//delete
   public void deleteCompanyById(int id){
    companyRepository.deleteCompanyById(id);
   }

}
