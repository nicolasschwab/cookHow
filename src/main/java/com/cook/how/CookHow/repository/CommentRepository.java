package com.cook.how.CookHow.repository;

import com.junicab.cookhow.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
