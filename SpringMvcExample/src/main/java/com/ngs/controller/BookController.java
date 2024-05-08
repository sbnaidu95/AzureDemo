package com.ngs.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ngs.bindings.Book;

@Controller  
public class BookController {
	@GetMapping("/book")
	public String getBookData(Model model) {
		Book bookObj=new Book(1,"ngs",100.00);
		model.addAttribute("book", bookObj);	
		return "book";
		
	}
	@GetMapping("/books")
	public String getBooksData(Model model) {
		Book b1=new Book(1,"java",100.00);
		Book b2=new Book(2,".net",200.00);
		Book b3=new Book(3,"python",300.00);
		Book b4=new Book(4,"oracle",400.00);
		List<Book> booksList = Arrays.asList(b1,b2,b3,b4);		
		model.addAttribute("books",booksList);
		return "books";
	}
	

}
