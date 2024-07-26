package guru.springframework.spring6webapp.repository;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 ** 2024, July 25, Thursday, 6:00 AM
 */

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
