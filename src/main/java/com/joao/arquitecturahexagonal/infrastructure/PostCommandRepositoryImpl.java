package com.joao.arquitecturahexagonal.infrastructure;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.joao.arquitecturahexagonal.domain.model.PostCommand;
import com.joao.arquitecturahexagonal.domain.model.PostQuery;
import com.joao.arquitecturahexagonal.domain.repository.PostCommandRepository;
import com.joao.arquitecturahexagonal.infrastructure.outbound.external.JsonPlaceholderAPIClient;

import lombok.RequiredArgsConstructor;

/*Adapter */

@Repository
@RequiredArgsConstructor
public class PostCommandRepositoryImpl implements PostCommandRepository{

    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;
    
    @Override
    public Optional<PostQuery> createPost(PostCommand postCommand) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.create(postCommand));
    }

    @Override
    public Optional<PostQuery> updatePost(PostCommand postCommand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePost'");
    }

    @Override
    public void deletePost(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePost'");
    }

}
