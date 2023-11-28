package com.example.develop.member.service;

import com.example.develop.authentication.MemberDetails;
import com.example.develop.member.domain.Member;
import com.example.develop.member.domain.MemberDto;
import com.example.develop.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService implements UserDetailsService {


    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String memberName) throws UsernameNotFoundException {
        Member member = memberRepository.findByMemberName(memberName);
        if(member != null) {
            return new MemberDetails(member);
        }
        return null;
    }

    @Transactional
    public int join(MemberDto memberDto) {
        try {
            memberDto.setMemberPw(passwordEncoder.encode(memberDto.getMemberPw()));
            memberRepository.save(memberDto.toEntity());
            return 100;
        }catch (Exception e){
            e.printStackTrace();
            log.info("memberservice " + e.getMessage());
        }
        return -100;
    }
}
