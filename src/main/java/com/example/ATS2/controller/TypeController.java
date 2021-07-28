package com.example.ATS2.controller;


import com.example.ATS2.service.TypeService;
import com.example.ATS2.dto.TypeDto;
import com.example.ATS2.entity.Type;
import com.example.ATS2.mapper.MapStructMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/vi/type")
public class TypeController {
    private  TypeService typeService;
    private  MapStructMapper mapStructMapper;

    @GetMapping
    private ResponseEntity<List<TypeDto>> findAll(){
        return ResponseEntity.ok(mapStructMapper.toTypeDtos(typeService.findAll()));
    }
    @PostMapping
    public ResponseEntity<TypeDto> create(@RequestBody TypeDto typeDto){
        typeService.save((mapStructMapper.typeToEntity((typeDto))));
        return ResponseEntity.status(HttpStatus.CREATED).body(typeDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeDto> findById(@PathVariable int id){
        Optional<Type> type = typeService.findById(id);
        return ResponseEntity.ok(mapStructMapper.typeToDto((type.get())));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TypeDto> update(@PathVariable int id, @RequestBody TypeDto typeDto){
        Type type = mapStructMapper.typeToEntity(typeDto);

        typeService.save(type);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(typeDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete( @PathVariable int id){
        typeService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
