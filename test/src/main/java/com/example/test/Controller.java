package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
List <Book> buecher = new ArrayList<>();
	
	
    @RequestMapping("/getbook")
    public Book getBook(@RequestParam(value="id") int id) {
        return buecher.get(id);
    }
    @RequestMapping("/postbook")
    public String postBook(@RequestParam(value="title", defaultValue="unbekannt") String title, @RequestParam(value="author", defaultValue="unbekannt") String author) {
        buecher.add(new Book(buecher.size(),title,author));
        return "Successfully updated";
    }
    
    
    
    
	
}
