package com.goodreads.backend.config;

import com.goodreads.backend.enums.Status;

import java.time.LocalDateTime;

public record UserBookDTO(
        Long id,
        BookDTO book,
        Status status,
        Integer currentPage,
        Integer rating,
        LocalDateTime dateStarted,
        LocalDateTime dateFinished
) {
}
