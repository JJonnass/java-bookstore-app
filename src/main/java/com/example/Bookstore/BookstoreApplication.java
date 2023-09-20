package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.model.Book;
import com.example.Bookstore.model.BookRepository;
import com.example.Bookstore.model.Category;
import com.example.Bookstore.model.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			crepository.save(new Category("Romance"));
			crepository.save(new Category("Mystery"));
			crepository.save(new Category("Adventure"));
			
			Book b1 = new Book("A Farewell to Arms", "Ernest Hemingway", 1929, "1232323-21", 49.99, crepository.findByName("Romance").get(0));
			Book b2 = new Book("Animal Farm", "George Orwell", 1945, "2212343-5", 39.99, crepository.findByName("Adventure").get(0));
			
			repository.save(b1);
			repository.save(b2);
		};
	}

}
