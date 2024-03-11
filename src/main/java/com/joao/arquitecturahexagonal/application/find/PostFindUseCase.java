package com.joao.arquitecturahexagonal.application.find;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.joao.arquitecturahexagonal.domain.model.PostQuery;
import com.joao.arquitecturahexagonal.domain.repository.PostQueryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostFindUseCase {
    private final PostQueryRepository postQueryRepository;
    public List<PostQuery> findAllPosts(){
        return this.postQueryRepository.findAllPosts();
    }
    public PostQuery findById(Integer id){
        return this.postQueryRepository.findById(id).orElseThrow();
    }
    public List<PostQuery> findAllPostsByUserId(Integer userId){
        return this.postQueryRepository.searchBy(Map.of("postId",String.valueOf(userId)));
    }
}