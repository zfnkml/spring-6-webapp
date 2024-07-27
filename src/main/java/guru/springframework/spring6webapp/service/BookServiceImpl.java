package guru.springframework.spring6webapp.service;

/*
 ** 2024, July 27, Saturday, 12:49 PM
 */

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
