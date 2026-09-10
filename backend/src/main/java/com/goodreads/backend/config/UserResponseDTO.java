package com.goodreads.backend.config;

import java.util.List;

public record UserResponseDTO(
        Long id,
        String username,
        String biography,
        String websiteLink,
        Integer readingGoal,
        List<GenreDTO> preferredGenres
) { }
