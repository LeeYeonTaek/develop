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

    private int member_id;
    private String member_name;
    private String member_pw;
    private String member_email;

    @Enumerated(EnumType.STRING)
    private RoleType role;
    private Timestamp member_reg_date;
    public Member toEntity() {
        Member member = Member.builder()
                .member_id(member_id)
                .member_name(member_name)
                .member_pw(member_pw)
                .member_email(member_email)
                .role(role)
                .member_reg_date(member_reg_date)
                .build();
        return member;
    }
}
