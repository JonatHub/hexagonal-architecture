package com.joao.arquitecturahexagonal.infrastructure.inbound.controllers;

import com.joao.arquitecturahexagonal.application.create.PostCreateUseCase;
import com.joao.arquitecturahexagonal.domain.model.PostCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.joao.arquitecturahexagonal.application.find.PostFindUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController{
    private final PostFindUseCase postFindUseCase;
    private final PostCreateUseCase postCreateUseCase;
    @GetMapping
    public ResponseEntity findAllPosts(){
        return ResponseEntity.ok(this.postFindUseCase.findAllPosts());
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody PostCommand postCommand){
        return ResponseEntity.ok(this.postCreateUseCase.createPost(postCommand));
    }
}