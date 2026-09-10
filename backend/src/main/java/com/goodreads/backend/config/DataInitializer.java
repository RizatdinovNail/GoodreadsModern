package com.goodreads.backend.config;

import com.goodreads.backend.entity.Book;
import com.goodreads.backend.entity.Genre;
import com.goodreads.backend.repository.BookRepository;
import com.goodreads.backend.repository.GenreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner intiDatabase(BookRepository bookRepo, GenreRepository genreRepo){
        return args -> {
            if (genreRepo.count() == 0){
                Genre highFantasy = new Genre();
                highFantasy.setName("High Fantasy");
                genreRepo.save(highFantasy);

                Genre childrenFantasy = new Genre();
                childrenFantasy.setName("Children's Fantasy");
                genreRepo.save(childrenFantasy);

                Genre adventure = new Genre();
                adventure.setName("Adventure");
                genreRepo.save(adventure);

                Book hobbit = new Book();
                hobbit.setTitle("The Hobbit");
                hobbit.setPublisher("George Allen & Unwin");
                hobbit.setAuthor("J.R.R. Tolkien");
                hobbit.setOverview("The Hobbit is set within Tolkien's Middle-earth and follows the quest of home-loving Bilbo Baggins, the titular hobbit, to win a share of the treasure guarded by a dragon named Smaug. Bilbo's journey takes him from his light-hearted, rural surroundings into more sinister territory. ");
                hobbit.setDatePublished("21 September 1937");
                hobbit.setAverageRating(4.8);
                hobbit.setCoverImageUrl("https://i0.wp.com/literariness.org/wp-content/uploads/2021/02/91b0C2YNSrL.jpg?resize=700%2C1084&ssl=1");
                hobbit.getGenres().add(highFantasy);
                hobbit.getGenres().add(childrenFantasy);
                hobbit.setIsbn("13. 978-0007458424");
                hobbit.setTotalPages(312);
                bookRepo.save(hobbit);

                Book lotr1 = new Book();
                lotr1.setTitle("The Lord Of the Rings: The Fellowship of The Ring");
                lotr1.setPublisher("George Allen & Unwin");
                lotr1.setAuthor("J.R.R. Tolkien");
                lotr1.setOverview("The Fellowship of the Ring is the first of three volumes of the epic novel The Lord of the Rings by the English author J. R. R. Tolkien; it is followed by The Two Towers and The Return of the King. The action takes place in the fictional universe of Middle-earth.");
                lotr1.setDatePublished("29 July 1954");
                lotr1.setAverageRating(4.9);
                lotr1.setCoverImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvdfMVBczG91MMuI_z_0oQ9sKJik7Hh6_lMk_mxTuZxg&s=10");
                lotr1.getGenres().add(highFantasy);
                lotr1.getGenres().add(adventure);
                lotr1.setIsbn("9780261103573");
                lotr1.setTotalPages(412);
                bookRepo.save(lotr1);

                Book lotr2 = new Book();
                lotr2.setTitle("The Lord Of the Rings: The Two Towers");
                lotr2.setPublisher("George Allen & Unwin");
                lotr2.setAuthor("J.R.R. Tolkien");
                lotr2.setOverview("The Fellowship of the Ring is the first of three volumes of the epic novel The Lord of the Rings by the English author J. R. R. Tolkien; it is followed by The Two Towers and The Return of the King. The action takes place in the fictional universe of Middle-earth.");
                lotr2.setDatePublished("11 November 1954");
                lotr2.setAverageRating(4.9);
                lotr2.setCoverImageUrl("https://upload.wikimedia.org/wikipedia/en/a/a1/The_Two_Towers_cover.gif?utm_source=en.wikipedia.org&utm_campaign=parser&utm_content=thumbnail_unscaled");
                lotr2.getGenres().add(highFantasy);
                lotr2.getGenres().add(adventure);
                lotr2.setIsbn("9733265503753");
                lotr2.setTotalPages(352);
                bookRepo.save(lotr2);

                Book lotr3 = new Book();
                lotr3.setTitle("The Lord Of the Rings: The Return of the Ring");
                lotr3.setPublisher("George Allen & Unwin");
                lotr3.setAuthor("J.R.R. Tolkien");
                lotr3.setOverview("The Return of the King is the third and final volume of J. R. R. Tolkien's The Lord of the Rings, following The Fellowship of the Ring and The Two Towers. It was published in 1955. The story begins in the kingdom of Gondor, which is soon to be attacked by the Dark Lord Sauron.");
                lotr3.setDatePublished("20 October 1955");
                lotr3.setAverageRating(4.9);
                lotr3.setCoverImageUrl("https://upload.wikimedia.org/wikipedia/en/1/11/The_Return_of_the_King_cover.gif?utm_source=en.wikipedia.org&utm_campaign=parser&utm_content=thumbnail_unscaled");
                lotr3.getGenres().add(highFantasy);
                lotr3.getGenres().add(adventure);
                lotr3.setIsbn("9544355536353");
                lotr3.setTotalPages(352);
                bookRepo.save(lotr3);
            }
        };
    }
}
