package guru.springframework.spring6webapp.bootstrap;

/*
 ** 2024, July 25, Thursday, 6:04 AM
 */

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.domain.Publisher;
import guru.springframework.spring6webapp.repository.AuthorRepository;
import guru.springframework.spring6webapp.repository.BookRepository;
import guru.springframework.spring6webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("54757585");


        Publisher publisher = new Publisher();
        publisher.setPublisherName("My Publisher");
        publisher.setAddress("123 Main");

        eric.getBookSet().add(ddd);
        ddd.getAuthorSet().add(eric);
        rod.getBookSet().add(noEJB);
        noEJB.getAuthorSet().add(rod);

        publisher.getBookSet().add(ddd);
        publisher.getBookSet().add(noEJB);

        ddd.setPublisher(publisher);
        noEJB.setPublisher(publisher);

        publisherRepository.save(publisher);
        bookRepository.save(ddd);
        bookRepository.save(noEJB);

        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}










