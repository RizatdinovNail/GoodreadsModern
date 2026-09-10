package com.goodreads.backend.repository;

import com.goodreads.backend.entity.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBookRepository extends JpaRepository<UserBook, Long> {
}
