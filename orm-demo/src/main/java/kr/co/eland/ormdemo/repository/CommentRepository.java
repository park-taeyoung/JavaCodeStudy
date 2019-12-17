package kr.co.eland.ormdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.eland.ormdemo.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
