package com.example.ATS2.controller;

import com.example.ATS2.dto.CompanyDto;
import com.example.ATS2.entity.Company;

import com.example.ATS2.mapper.MapStructMapper;
import com.example.ATS2.service.CompanyServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/company/")
public class CompanyController {

    @Autowired
    private final CompanyServices companyServices;
    private final MapStructMapper mapStructMapper;

    @GetMapping
    public ResponseEntity<List<CompanyDto>> findAll() {
        return ResponseEntity.ok(mapStructMapper.toCompanyDtos(companyServices.getAllCompany()));
    }

    @PostMapping
    public ResponseEntity<CompanyDto> create(@RequestBody CompanyDto companyDto) {
        companyServices.saveCompany(mapStructMapper.companyToEntity(companyDto));

        return ResponseEntity.status(HttpStatus.CREATED).body(companyDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDto> findById(@PathVariable int id) {
        Optional<Company>company = companyServices.findById(id);

        return ResponseEntity.ok(mapStructMapper.companyDto(company.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyDto> update(@PathVariable int id, @RequestBody CompanyDto companyDto) {
        Company company = mapStructMapper.companyToEntity(companyDto);
        company.setId(id);

        companyServices.saveCompany(company);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(companyDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        companyServices.deleteCompanyById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}


