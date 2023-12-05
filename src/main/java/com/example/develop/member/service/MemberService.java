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

import java.util.Optional;

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

    @Transactional
    public MemberDto findByMemberName(String memberName) {
        Member member = memberRepository.findByMemberName(memberName);
        MemberDto memberDto =  MemberDto.builder()
                                .memberId(member.getMemberId())
                                .memberName(member.getMemberName())
                                .memberPw(member.getMemberPw())
                                .memberEmail(member.getMemberEmail())
                                .role(member.getRole())
                                .memberRegDate(member.getMemberRegDate())
                                .build();
        return memberDto;
    }

    @Transactional
    public int update (MemberDto memberDto) {
        Optional<Member> optionalMember = memberRepository.findById(memberDto.getMemberId());
        if(optionalMember.isPresent()) {
            Member member = optionalMember.get();
            member.setMemberEmail(memberDto.getMemberEmail());
            memberRepository.save(member);
            return 1;
        } else {
            return 0;
        }
    }
}
