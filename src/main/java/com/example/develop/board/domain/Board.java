package com.example.develop.board.domain;

import com.example.develop.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member author;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 10000)
    private String content;
    @CreationTimestamp
    private Timestamp createdDate;

    @LastModifiedDate
    private Timestamp lastModifiedDate;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comment> comments = new ArrayList<>();

    @PreUpdate
    public void setLastModifiedDate() {
        this.lastModifiedDate = new Timestamp(System.currentTimeMillis());
    }
}
