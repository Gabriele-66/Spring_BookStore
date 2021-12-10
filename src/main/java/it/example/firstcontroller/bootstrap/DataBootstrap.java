package it.example.firstcontroller.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.example.firstcontroller.model.Author;
import it.example.firstcontroller.model.Book;

@Component
public class DataBootstrap implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        Author gab = new Author();
        gab.setName("Gabriele");
        gab.setSurname("Recchia");

        Book book1 = new Book();
        book1.setTitle("primo libro");
        book1.setISBN("abc123");
        book1.setAuthor(gab);
        
    }

}