package com.joao.arquitecturahexagonal.infrastructure;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.joao.arquitecturahexagonal.domain.model.PostQuery;
import com.joao.arquitecturahexagonal.domain.repository.PostQueryRepository;
import com.joao.arquitecturahexagonal.infrastructure.outbound.external.JsonPlaceholderAPIClient;

import lombok.RequiredArgsConstructor;

/*Adapter */

@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {
    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;
    @Override
    public Optional<PostQuery> findById(int id) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.findPostById(id));
    }

    @Override
    public List<PostQuery> searchBy(Map<String, String> params) {
        return jsonPlaceholderAPIClient.searchByParam(params);
    }

    @Override
    public List<PostQuery> findAllPosts() {
        return jsonPlaceholderAPIClient.getAllPosts();
    }
}
