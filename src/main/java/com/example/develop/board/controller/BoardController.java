package com.example.develop.board.controller;

import com.example.develop.board.domain.Board;
import com.example.develop.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("")
    public String list(ModelAndView modelAndView) {

        List<Board> boardList = boardService.findAll();
        for (Board board : boardList) {
            log.info(board.toString());
        }
        modelAndView.addObject("boardList", boardList);
        return "board/list";
    }
}
