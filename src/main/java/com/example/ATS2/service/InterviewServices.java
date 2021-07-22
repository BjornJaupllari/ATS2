package com.example.ATS2.service;

import com.example.ATS2.entity.Interview;
import com.example.ATS2.repository.InterviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class InterviewServices {
    @Autowired
    private final InterviewRepository interviewRepository;


    // getall
    public List<Interview> getAll() {
        return interviewRepository.findAll();
    }
    //GetCompByd

    public Optional<Interview> findById(int id) {
        return interviewRepository.findById( id );
    }

    //save
    public Interview save(@RequestBody Interview interview) {
        return interviewRepository.save( interview );
    }

    //delete
    public void deleteById(int id) {
        interviewRepository.deleteById( id );
    }
}
