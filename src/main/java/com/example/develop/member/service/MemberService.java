package com.example.develop.member.service;

import com.example.develop.member.domain.MemberDto;
import com.example.develop.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {


    private final MemberRepository memberRepository;

    @Transactional
    public int join(MemberDto memberDto) {
        try {
            memberRepository.save(memberDto.toEntity());
            return 100;
        }catch (Exception e){
            e.printStackTrace();
            log.info("memberservice " + e.getMessage());
        }
        return -100;
    }
}
