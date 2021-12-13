package it.example.firstcontroller.repository;

import org.springframework.data.repository.CrudRepository;

import it.example.firstcontroller.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> { //Long tipo id
    
}
