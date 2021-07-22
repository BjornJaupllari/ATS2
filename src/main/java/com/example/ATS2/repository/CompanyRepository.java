package com.example.ATS2.repository;

import com.example.ATS2.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {


    Optional<Company> findById(int id);

    void deleteCompanyById(int id);
}
