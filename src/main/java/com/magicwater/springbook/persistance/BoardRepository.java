package com.magicwater.springbook.persistance;

import java.util.List;

import com.magicwater.springbook.domain.Board;

import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
    List<Board> findByTitle(String searchKeyword);
    List<Board> findByContentContaining(String content);
}