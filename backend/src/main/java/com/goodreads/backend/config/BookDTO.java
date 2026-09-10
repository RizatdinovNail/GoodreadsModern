package com.goodreads.backend.config;

public record BookDTO(
        Long id,
        String title,
        String author,
        String isbn,
        String publisher,
        String datePublished,
        Integer totalPages,
        String overview,
        String coverImageUrl,
        Double averageRating ) { }
