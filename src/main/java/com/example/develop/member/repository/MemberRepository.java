package com.example.develop.member.repository;

import com.example.develop.member.domain.Member;
import com.example.develop.member.domain.MemberDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByMemberName(String memberName);
}
