package it.example.firstcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.example.firstcontroller.repository.BookRepository;

@Controller
public class BookController {
    
    BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks( Model model ) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }

}
