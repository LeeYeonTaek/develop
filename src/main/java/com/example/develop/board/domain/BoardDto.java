package com.example.develop.board.domain;


import com.example.develop.member.domain.Member;
import com.example.develop.member.domain.RoleType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {

    private int id;
    private Member author;
    private String title;
    private Timestamp createdDate;
    private Timestamp lastModifiedDate;
    private List<Comment> comments;

    public static BoardDto fromEntity(Board board) {
        return BoardDto.builder()
                .id(board.getId())
                .author(board.getAuthor())
                .title(board.getTitle())
                .createdDate(board.getCreatedDate())
                .lastModifiedDate(board.getLastModifiedDate())
                .comments(board.getComments())
                .build();
    }

    // Add getters and setters if needed
}
