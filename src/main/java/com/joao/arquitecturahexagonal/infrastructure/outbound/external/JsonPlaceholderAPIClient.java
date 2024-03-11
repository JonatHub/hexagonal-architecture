package com.joao.arquitecturahexagonal.infrastructure.outbound.external;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.joao.arquitecturahexagonal.domain.model.PostCommand;
import com.joao.arquitecturahexagonal.domain.model.PostQuery;

@FeignClient(name = "${json-placeholder.client.name}", url = "${json-placeholder.url}")
public interface JsonPlaceholderAPIClient {

    @PostMapping("/posts")
    PostQuery create(@RequestBody PostCommand request);

    @GetMapping("/posts/{id}")
    PostQuery findPostById(@PathVariable Integer id);

    @GetMapping
    List<PostQuery> getAllPosts();

    @GetMapping("comments")
    List<PostQuery> searchByParam(@RequestParam Map<String, String> params);

}