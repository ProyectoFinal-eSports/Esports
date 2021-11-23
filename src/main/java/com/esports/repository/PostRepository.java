package com.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
