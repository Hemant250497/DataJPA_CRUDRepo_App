package com.tcs;

import com.tcs.entity.Book;
import com.tcs.repo.BookRepository;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DataJpaCrudRepoAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		ConfigurableApplicationContext ctxt =SpringApplication.run(DataJpaCrudRepoAppApplication.class, args);
		BookRepository repo = ctxt.getBean(BookRepository.class);
		/*Book b = new Book();
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(1000.00);

		repo.save(b);
		System.out.println("Record inserted");*/

		Optional<Book> findById =repo.findById(101);
		System.out.println(findById.get());
	}

}
