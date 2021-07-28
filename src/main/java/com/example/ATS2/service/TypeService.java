package com.example.ATS2.service;


import com.example.ATS2.entity.Type;
import com.example.ATS2.repository.TypeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Service
public class TypeService {

    private TypeRepository typeRepository;

    public List<Type> findAll() {
        return typeRepository.findAll();
    }

    public Optional<Type> findById(int id) {
        return typeRepository.findById(id);
    }

    public Type save(Type stock) {
        return typeRepository.save(stock);
    }

    public void deleteById(int id) {
        typeRepository.deleteById(id);
    }

}
