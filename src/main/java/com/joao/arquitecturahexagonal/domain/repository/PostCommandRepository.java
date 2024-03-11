package com.joao.arquitecturahexagonal.domain.repository;

import java.util.Optional;

import com.joao.arquitecturahexagonal.domain.model.PostCommand;
import com.joao.arquitecturahexagonal.domain.model.PostQuery;

public interface PostCommandRepository {
    Optional<PostQuery> createPost(PostCommand postCommand);
    Optional<PostQuery> updatePost(PostCommand postCommand);
    void deletePost(int id);
}