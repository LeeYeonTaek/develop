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

    @Transactional
    public int join(MemberDto memberDto) {
        try {
            memberDto.setMember_pw(passwordEncoder.encode(memberDto.getMember_pw()));
            memberRepository.save(memberDto.toEntity());
            return 100;
        }catch (Exception e){
            e.printStackTrace();
            log.info("memberservice " + e.getMessage());
        }
        return -100;
    }

    @Override
    public UserDetails loadUserByUsername(String member_name) throws UsernameNotFoundException {
        Member member = memberRepository.findByMember_name(member_name);
        if(member != null) {
            return new MemberDetails(member);
        }
        return null;
    }
}
