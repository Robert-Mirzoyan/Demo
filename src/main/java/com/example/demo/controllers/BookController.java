package com.example.demo.controllers;

import com.example.demo.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String books(Model model) {
        model.addAttribute("books", bookRepository.findAll());

        return "books/list";
    }
}
