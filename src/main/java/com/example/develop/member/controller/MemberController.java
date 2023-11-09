package com.example.develop.member.controller;

import com.example.develop.member.domain.MemberDto;
import com.example.develop.member.domain.ResponseDto;
import com.example.develop.member.domain.RoleType;
import com.example.develop.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/member/join")
    public String joinForm() {
        return "member/join";
    }

    @PostMapping("/member/join")
    public ResponseDto<Integer> save(@RequestBody MemberDto memberDto) {
        memberDto.setRole(RoleType.USER);
        int result = memberService.join(memberDto);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), result);
    }
}

