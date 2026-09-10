package com.goodreads.backend.entity;

import com.goodreads.backend.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="user_book")
@Getter @Setter @NoArgsConstructor
public class UserBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="status", unique = false, nullable = false)
    private Status status = Status.WANT_TO_READ;

    @Column(name="current_page", unique = false, nullable = false)
    private Integer currentPage = 0;

    @Column(name="rating", unique = false, nullable = true)
    private Integer rating;

    @Column(name="date_started", unique = false, nullable = true)
    private LocalDateTime dateStarted;

    @Column(name="date_finished", unique = false, nullable = true)
    private LocalDateTime dateFinished;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="book_id", nullable = false)
    private Book book;
}
