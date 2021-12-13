package it.example.firstcontroller.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.example.firstcontroller.model.Author;
import it.example.firstcontroller.model.Book;
import it.example.firstcontroller.repository.AuthorRepository;
import it.example.firstcontroller.repository.BookRepository;

@Component
public class DataBootstrap implements CommandLineRunner{
    private AuthorRepository authorRepository;
    private BookRepository bookrepository;

    public DataBootstrap() {}
    public DataBootstrap(AuthorRepository authorRepository, BookRepository bookrepository) {
        this.authorRepository = authorRepository;
        this.bookrepository = bookrepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author gab = new Author();
        gab.setName("Gabriele");
        gab.setSurname("Recchia");

        Book book1 = new Book();
        book1.setTitle("primo libro");
        book1.setISBN("abc123");
        book1.setAuthor(gab);
        
        authorRepository.save(gab);
        bookrepository.save(book1);

    }

}