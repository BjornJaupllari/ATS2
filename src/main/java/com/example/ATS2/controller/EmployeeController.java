package com.example.ATS2.controller;

import com.example.ATS2.dto.EmployeeDto;
import com.example.ATS2.entity.Employee;
import com.example.ATS2.mapper.MapStructMapper;
import com.example.ATS2.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;
    private final MapStructMapper mapStructMapper;

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> findAll() {
        return ResponseEntity.ok(mapStructMapper.toEmployeeDtos(employeeService.getAll()));
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto employeeDto) {
        employeeService.save(mapStructMapper.employeeToEntity(employeeDto));

        return ResponseEntity.status( HttpStatus.CREATED).body(employeeDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable int id) {
        Optional<Employee> employee = employeeService.findById(id);

        return ResponseEntity.ok(mapStructMapper.employeeToDto(employee.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> update(@PathVariable int id, @RequestBody EmployeeDto employeeDto) {
        Employee employee = mapStructMapper.employeeToEntity(employeeDto);
        employee.setId(id);

        employeeService.save(employee);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        employeeService.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
