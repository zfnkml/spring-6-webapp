package guru.springframework.spring6webapp.service;

import guru.springframework.spring6webapp.domain.Book;

/*
 ** 2024, July 27, Saturday, 12:54 PM
 */
public interface BookService {
    Iterable<Book> findAll();
}
