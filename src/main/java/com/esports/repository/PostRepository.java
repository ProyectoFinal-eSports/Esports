package com.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByDateDesc();
    List<Post> findTop3ByOrderByDateDesc();
    List<Post> findTop3ByRegisteredOrderByDateDesc(Boolean registered);
}
