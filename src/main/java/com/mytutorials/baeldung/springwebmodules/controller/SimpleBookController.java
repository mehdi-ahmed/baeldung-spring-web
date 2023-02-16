package com.mytutorials.baeldung.springwebmodules.controller;

import com.mytutorials.baeldung.springwebmodules.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("books")
public class SimpleBookRestController {

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/json")
    public @ResponseBody Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

    private Book findBookById(int id) {
        Book book = null;
        if (id == 42) {
            book = new Book();
            book.setId(id);
            book.setAuthor("George R. R. Martin");
            book.setTitle("A Song of Ice and Fire");
        }
        return book;
    }
}
