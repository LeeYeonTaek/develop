package com.example.develop.member.controller;

import com.example.develop.member.domain.Member;
import com.example.develop.member.domain.MemberDto;
import com.example.develop.member.domain.ResponseDto;
import com.example.develop.member.domain.RoleType;
import com.example.develop.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public String joinForm() {
        return "member/join";
    }

    @PostMapping("/join")
    public ResponseDto<Integer> save(@RequestBody MemberDto memberDto) {
        log.info("join save");
        memberDto.setRole(RoleType.USER);
        int result = memberService.join(memberDto);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), result);
    }

    @GetMapping("/login")
    public String loginForm() {
        return "member/login";
    }

    @GetMapping("/mypage")
    public String mypage(@AuthenticationPrincipal UserDetails userDetails, Model model) {
        MemberDto memberDto = memberService.findByMemberName(userDetails.getUsername());
        model.addAttribute("member", memberDto);
        return "member/mypage";
    }
}

