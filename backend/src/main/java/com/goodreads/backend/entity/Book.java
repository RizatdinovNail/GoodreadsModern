package com.goodreads.backend.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="books")
@Getter @Setter @NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", unique = false, nullable = false)
    private String title;

    @Column(name="author", unique = false, nullable = false)
    private String author;

    @Column(name="isbn", unique = true, nullable = false)
    private String isbn;

    @Column(name="publisher", unique = false, nullable = false)
    private String publisher;

    @Column(name="date_published", unique = false, nullable = false)
    private String datePublished;

    @Column(name="total_pages", unique = false, nullable = false)
    private Integer totalPages;

    @Column(name="overview", unique=false, nullable = false, columnDefinition = "TEXT")
    private String overview;

    @Column(name="cover_image_url", unique = true, nullable = false)
    private String coverImageUrl;

    @Column(name="average_rating", unique = false, nullable = false)
    private Double averageRating;

    @ManyToMany
    @JoinTable(name="book_genres", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name="genre_id"))
    private Set<Genre> genres = new HashSet<>();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<UserBook> userBooks = new ArrayList<>();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();
}
