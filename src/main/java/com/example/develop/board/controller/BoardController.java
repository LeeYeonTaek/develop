package com.example.develop.board.controller;

import com.example.develop.authentication.MemberDetails;
import com.example.develop.board.domain.Board;
import com.example.develop.board.domain.BoardDto;
import com.example.develop.board.service.BoardService;
import com.example.develop.member.domain.Member;
import com.example.develop.member.domain.MemberDto;
import com.example.develop.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    private final MemberService memberService;

    @GetMapping("")
    public String list(ModelAndView modelAndView) {

        List<Board> boardList = boardService.findAll();
        for (Board board : boardList) {
            log.info(board.toString());
        }
        modelAndView.addObject("boardList", boardList);
        return "board/list";
    }

    @GetMapping("/create")
    public String create(ModelAndView modelAndView) {
        return "board/create";
    }

    @PostMapping("/create")
    public ResponseEntity<String> createResource(@AuthenticationPrincipal UserDetails userDetails, @RequestBody BoardDto boardDto) {
        MemberDetails memberDetails = (MemberDetails) userDetails;
        Member member = memberDetails.getMember();
        boardDto.setAuthor(member);
        boolean result = boardService.create(boardDto);
        if (!result) {
            return new ResponseEntity<>("{\"result\": \"fail\"}", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("{\"result\": \"success\"}", HttpStatus.OK);
    }
}
