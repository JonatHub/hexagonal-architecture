package com.joao.arquitecturahexagonal.application.create;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.joao.arquitecturahexagonal.domain.model.PostCommand;
import com.joao.arquitecturahexagonal.domain.model.PostQuery;
import com.joao.arquitecturahexagonal.domain.repository.PostCommandRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostCreateUseCase {

    private final PostCommandRepository postCommandRepository;

    public Optional<PostQuery> createPost(PostCommand postCommand){
        return this.postCommandRepository.createPost(postCommand);
    }
    public Optional<PostQuery> updatePost(PostCommand postCommand){
        return this.postCommandRepository.updatePost(postCommand);
    }
    public void deletePost(int id){
        this.postCommandRepository.deletePost(id);
    }
}
