package it.example.firstcontroller.repository;

import org.springframework.data.repository.CrudRepository;

import it.example.firstcontroller.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
