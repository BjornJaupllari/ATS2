package com.example.ATS2.controller;

import com.example.ATS2.service.PostService;
import com.example.ATS2.dto.PostDto;
import com.example.ATS2.entity.Post;
import com.example.ATS2.mapper.MapStructMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/vi/post")
public class PostController {
    private PostService postService;
    private MapStructMapper mapStructMapper;

    @GetMapping
    public ResponseEntity<List<PostDto>> findAll() {
        return ResponseEntity.ok(mapStructMapper.toPostDtos(postService.findAll()));
    }

    @PostMapping
    public ResponseEntity<PostDto> create(@RequestBody PostDto postDto) {
        postService.save(mapStructMapper.postToEntity(postDto));

        return ResponseEntity.status(HttpStatus.CREATED).body(postDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> findById(@PathVariable int id) {
        Optional<Post> post = postService.findById(id);

        return ResponseEntity.ok(mapStructMapper.postToDto(post.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDto> update(@PathVariable int id, @RequestBody PostDto postDto) {
        Post post = mapStructMapper.postToEntity(postDto);

        postService.save(post);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(postDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        postService.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
