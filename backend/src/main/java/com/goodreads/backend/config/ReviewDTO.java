package com.goodreads.backend.config;

import java.time.LocalDateTime;

public record ReviewDTO(
        Long id,
        String content,
        Integer rating,
        Integer likesCount,
        String username,
        LocalDateTime createdAt
) {

}
