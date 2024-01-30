package com.example.develop.board.service;

import com.example.develop.authentication.MemberDetails;
import com.example.develop.board.domain.Board;
import com.example.develop.board.repository.BoardRepository;
import com.example.develop.member.domain.Member;
import com.example.develop.member.domain.MemberDto;
import com.example.develop.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardService  {

    private final BoardRepository boardRepository;
    @Transactional
    public List<Board> findAll() {
        Pageable pageable = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "createdDate"));
        List<Board> boardList = boardRepository.findAll(pageable).getContent();
        return boardList;
    }

    private final BCryptPasswordEncoder passwordEncoder;


}
