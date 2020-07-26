package com.magicwater.springbook.controller;

import com.magicwater.springbook.domain.Board;
import com.magicwater.springbook.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
    
    @Autowired
    private BoardService boardService;

    @RequestMapping("/getBoardList")
    @ResponseBody
    public ModelAndView getBoardList(Model model, Board board){

        Page<Board> boardList = boardService.getBoardList(board);
        model.addAttribute("boardList", boardList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("board/getBoardList");
        return modelAndView;
    }

    @GetMapping("/getBoard")
    public ModelAndView getBoard(Board board, Model model){
        model.addAttribute("board", boardService.getBoard(board));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("board/getBoard");
        return modelAndView;
    }

    


}