package com.example.ATS2.repository;

import com.example.ATS2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepository extends JpaRepository<Employee, Integer> {
}
