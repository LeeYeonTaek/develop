package com.example.develop.member.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {

    private int memberId;
    private String memberName;
    private String memberPw;
    private String memberEmail;

    @Enumerated(EnumType.STRING)
    private RoleType role;
    private Timestamp memberRegDate;

    private String currentPw;
    private String newPw;
    public Member toEntity() {
        Member member = Member.builder()
                .memberId(memberId)
                .memberName(memberName)
                .memberPw(memberPw)
                .memberEmail(memberEmail)
                .role(role)
                .memberRegDate(memberRegDate)
                .build();
        return member;
    }
}
