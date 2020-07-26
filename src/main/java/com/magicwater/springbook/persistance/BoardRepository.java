package com.magicwater.springbook.persistance;

// import java.util.List;

import com.magicwater.springbook.domain.Board;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long>/*,QuerydslPredicateExecutor<Board>*/ {

    /*
    List<Board> findByTitle(String searchKeyword);
    List<Board> findByContentContaining(String content);
    */

    @Query("SELECT b from Board b")
    Page<Board> getBoardList(Pageable pageable);
}