package com.example.develop.board.repository;

import com.example.develop.board.domain.Board;
import com.example.develop.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
