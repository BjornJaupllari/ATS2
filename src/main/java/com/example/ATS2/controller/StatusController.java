package com.example.ATS2.controller;


import com.example.ATS2.service.StatusService;
import com.example.ATS2.dto.StatusDto;
import com.example.ATS2.entity.Status;
import com.example.ATS2.mapper.MapStructMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/vi/status")
public class StatusController {
    private StatusService statusService;
    private MapStructMapper mapStructMapper;

    @GetMapping
    public ResponseEntity<List<StatusDto>> findAll(){
        return ResponseEntity.ok(mapStructMapper.toStatusDtos(statusService.findAll()));
    }

    @PostMapping
    public ResponseEntity<StatusDto> create(@RequestBody StatusDto statusDto){
        statusService.save(mapStructMapper.statusToEntity(statusDto));

        return ResponseEntity.status(HttpStatus.CREATED).body(statusDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusDto> findById(@PathVariable int id){
        Optional<Status> status = statusService.findById(id);
        return ResponseEntity.ok(mapStructMapper.statusToDto(status.get()));
    }
    @PutMapping("/{id}")
    public ResponseEntity<StatusDto> update(@PathVariable int id, @RequestBody StatusDto statusDto){
        Status status = mapStructMapper.statusToEntity(statusDto);


        statusService.save(status);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(statusDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        statusService.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
