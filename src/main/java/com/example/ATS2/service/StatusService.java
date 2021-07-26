package com.example.ATS2.service;


import com.example.ATS2.entity.Status;
import com.example.ATS2.repository.StatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StatusService {

    private final StatusRepository statusRepository;

    public List<Status> findAll() {
        return statusRepository.findAll();
    }

    public Optional<Status> findById(int id) {
        return statusRepository.findById(id);
    }

    public Status save(Status stock){
        return statusRepository.save(stock);
    }

    public void deleteById(int id){
        statusRepository.deleteById(id);
    }

}
