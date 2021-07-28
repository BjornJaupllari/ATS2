package com.example.ATS2.service;


import com.example.ATS2.entity.Post;
import com.example.ATS2.repository.PostRepository;
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
public class PostService {
    private PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }

    public Post save(Post stock) {
        return postRepository.save(stock);
    }

    public void deleteById(int id) {
        postRepository.deleteById(id);
    }
}