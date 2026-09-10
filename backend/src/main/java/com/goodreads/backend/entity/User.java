package com.goodreads.backend.entity;

import com.goodreads.backend.enums.PageNumberFormat;
import com.goodreads.backend.enums.Privacy;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="users")
@Getter @Setter @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name="username", unique = true, nullable = false)
    private String username;

    @Column(name="password", unique = false, nullable = false)
    private String password;

    @Column(name="biography", unique = false, nullable = true, columnDefinition = "TEXT")
    private String biography;

    @Column(name="website_link", unique = false, nullable = true)
    private String websiteLink;

    @Column(name="reading_goal", unique = false, nullable = false)
    private Integer readingGoal = 1;

    @Enumerated(EnumType.STRING)
    @Column(name="page_number_format", unique = false, nullable = false)
    private PageNumberFormat pageNumberFormat = PageNumberFormat.PAGES;

    @Column(name="timezone", unique = false, nullable = false)
    private String timezone;

    @Enumerated(EnumType.STRING)
    @Column(name="visibility_profile", unique = false, nullable = false)
    private Privacy visibilityProfile = Privacy.PUBLIC;

    @Enumerated(EnumType.STRING)
    @Column(name="visibility_shelves", unique = false, nullable = false)
    private Privacy visibilityShelves = Privacy.PUBLIC;

    @Enumerated(EnumType.STRING)
    @Column(name="visibility_reviews", unique = false, nullable = false)
    private Privacy visibilityReviews = Privacy.PUBLIC;

    @Column(name="show_reading_activity", unique = false, nullable = false)
    private Boolean showReadingActivity = true;

    @Column(name="appear_in_search", unique = false, nullable = false)
    private Boolean appearInSearch = true;

    @Column(name="allow_tagging", unique = false, nullable = false)
    private Boolean allowTagging = true;

    @ManyToMany
    @JoinTable(name = "user_preferred_genres", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> preferredGenres = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserBook> userBooks = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

}
