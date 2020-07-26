package com.magicwater.springbook;

import java.util.Date;

import com.magicwater.springbook.domain.Board;
import com.magicwater.springbook.persistance.BoardRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BoardRepositoryTest {
    @Autowired
    private BoardRepository boardRepo;

    /*
    @Test
    public void testInsertBoard(){
        Board board = new Board();
        board.setTitle("title");
        board.setWriter("writer");
        board.setContent("content");
        board.setCreateDate(new Date());
        board.setCnt(0L);

        boardRepo.save(board);
    }
    */
    @Test
    public void testGetBoard(){
        Board board = boardRepo.findById(1L).get();
        System.out.println(board.toString());
    }


    @Test
    public void testUpdateBoard(){
        System.out.println("=== 1번 게시글 조회 ===");
        Board board = boardRepo.findById(1L).get();

        System.out.println("=== 1번 게시글 제목 수정 ===");
        board.setTitle("modifiedTitile");
        boardRepo.save(board);
    }

}