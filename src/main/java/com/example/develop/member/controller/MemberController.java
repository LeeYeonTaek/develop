package com.example.develop.member.controller;

import com.example.develop.member.domain.Member;
import com.example.develop.member.domain.MemberDto;
import com.example.develop.member.domain.ResponseDto;
import com.example.develop.member.domain.RoleType;
import com.example.develop.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
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
    public String mypage(@AuthenticationPrincipal UserDetails userDetails, ModelAndView model) {
        return "member/mypage";
    }


    @PostMapping("/mypage")
    public String mypageUpdate(MemberDto memberDto, ModelAndView model) {
        log.info("mypage update");
        Member member = memberService.update(memberDto);
        model.addObject("member", member);
        return "member/mypage";
    }

    @GetMapping("/pwChange")
    public String pwChangeForm() {
        return "member/pwChange";
    }

    @PostMapping("/pwChange")
    public String pwChangeUpdate(@AuthenticationPrincipal UserDetails userDetails, MemberDto memberDto) {
        if(!bCryptPasswordEncoder.matches(memberDto.getCurrentPw(), userDetails.getPassword())) {
            return "redirect:/member/pwChange?error";
        }
        memberDto.setMemberName(userDetails.getUsername());
        memberService.pwChange(memberDto);

        return "member/pwChange";
    }
}

