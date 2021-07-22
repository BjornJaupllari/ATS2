package com.example.ATS2.controller;


import com.example.ATS2.dto.InterviewDto;
import com.example.ATS2.entity.Interview;
import com.example.ATS2.mapper.MapStructMapper;
import com.example.ATS2.service.InterviewServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/interview")
public class InterviewController {
    @Autowired
    private final InterviewServices interviewServices;
    private final MapStructMapper mapStructMapper;

    @GetMapping
    public ResponseEntity<List<InterviewDto>> findAll() {
        return ResponseEntity.ok(mapStructMapper.toInterviewDtos(interviewServices.getAll()));
    }

    @PostMapping
    public ResponseEntity<InterviewDto> create(@RequestBody InterviewDto interviewDto) {
        interviewServices.save(mapStructMapper.interviewToEntity(interviewDto));

        return ResponseEntity.status( HttpStatus.CREATED).body(interviewDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InterviewDto> findById(@PathVariable int id) {
        Optional<Interview> interview = interviewServices.findById(id);

        return ResponseEntity.ok(mapStructMapper.interviewToDto(interview.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InterviewDto> update(@PathVariable int id, @RequestBody InterviewDto interviewDto) {
        Interview interview = mapStructMapper.interviewToEntity(interviewDto);
        interview.setId(id);

        interviewServices.save(interview);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(interviewDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        interviewServices.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}