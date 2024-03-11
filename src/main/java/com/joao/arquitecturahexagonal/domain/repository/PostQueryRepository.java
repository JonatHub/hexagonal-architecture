package com.joao.arquitecturahexagonal.domain.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.joao.arquitecturahexagonal.domain.model.PostQuery;

public interface PostQueryRepository {
    Optional<PostQuery> findById(int id);
    List<PostQuery> searchBy(Map<String, String> params);
    List<PostQuery> findAllPosts();
}
