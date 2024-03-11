package com.joao.arquitecturahexagonal.infrastructure.inbound.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joao.arquitecturahexagonal.application.find.PostFindUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final PostFindUseCase postFindUseCase;
    @GetMapping("/{id}/posts")
    public ResponseEntity findAllPosts(@PathVariable Integer id){
        return ResponseEntity.ok(this.postFindUseCase.findAllPostsByUserId(id));
    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Integer id){
        return ResponseEntity.ok(this.postFindUseCase.findById(id));
    }

}