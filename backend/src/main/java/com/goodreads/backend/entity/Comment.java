package com.goodreads.backend.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name="comments")
@Getter @Setter @NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="comment_text", nullable = false, unique = false)
    private String commentText;

    @Column(name="created_at", nullable = false, unique = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="review_id", nullable=false)
    private Review review;

}
