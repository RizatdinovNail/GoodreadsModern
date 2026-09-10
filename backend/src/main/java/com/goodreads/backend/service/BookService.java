package com.goodreads.backend.service;

import com.goodreads.backend.config.BookDTO;
import com.goodreads.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(book-> new BookDTO(
                        book.getId(),
                        book.getTitle(),
                        book.getAuthor(),
                        book.getIsbn(),
                        book.getPublisher(),
                        book.getDatePublished(),
                        book.getTotalPages(),
                        book.getOverview(),
                        book.getCoverImageUrl(),
                        book.getAverageRating()))
                .toList();
    }
}
